import java.util.Scanner;

public class Main{
	
	static int xrotation(int x, int y) {
		return -y;
	}//x90度回転
	static int yrotation(int x, int y) {
		return x;
	}//y90度回転
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				int m=sc.nextInt();
				int[] basex=new int[m+1];
				int[] basey=new int[m+1];
				for(int i=1; i<=m; i++) {
					basex[i]=sc.nextInt();
					basey[i]=sc.nextInt();
				}//折れ線₀
				int bxd=basex[1];
				int byd=basey[1];
				for(int i=1; i<=m; i++) {
					basex[i]=basex[i]-bxd;
					basey[i]=basey[i]-byd;
					//System.out.printf("basex[%d]=%d, basey[%d]=%d\n",i, basex[i],i, basey[i]);
				}
				boolean[] check=new boolean[n+1];
				for(int i=1; i<=n; i++) {
					m=sc.nextInt();
					check[i]=false;
					int[] x=new int[m+1];
					int[] y=new int[m+1];
					for(int j=1; j<=m; j++) {
						x[j]=sc.nextInt();
						y[j]=sc.nextInt();
					}//折れ線₁～折れ線n
					
					int xd=0;
					int yd=0;
					//System.out.printf("xd=%d, yd=%d\n",xd, yd);
					for(int t=0; t<2; t++) {
						if(t==0) {
							xd=x[1]-basex[1];
							yd=y[1]-basey[1];
							for(int j=1; j<=m; j++) {
								x[j]=x[j]-xd;
								y[j]=y[j]-yd;
								//System.out.printf("x[%d]=%d, y[%d]=%d\n",j, x[j],j, y[j]);
							}//平行移動

							for(int k=0; k<4; k++) {
								int count=0;
								for(int j=1; j<=m; j++) {
									int xj=x[j];
									int yj=y[j];
									x[j]=xrotation(xj, yj);
									y[j]=yrotation(xj, yj);
									//System.out.printf("x[%d]=%d, y[%d]=%d\n",j, x[j],j, y[j]);
									if(basex[j]==x[j] && basey[j]==y[j]) {
										count++;
									}
								}//回転
								if(count==m) {
									check[i]=true;
									break;
								}
							}//90, 180, 270, 360回転
						}
						else if(t==1) {
							xd=x[m]-basex[1];
							yd=y[m]-basey[1];
							for(int j=1; j<=m; j++) {
								x[j]=x[j]-xd;
								y[j]=y[j]-yd;
								//System.out.printf("x[%d]=%d, y[%d]=%d\n",j, x[j],j, y[j]);
							}//平行移動
							
							for(int k=0; k<4; k++) {
								int count=0;
								for(int j=1; j<=m; j++) {
									int xj=x[j];
									int yj=y[j];
									x[j]=xrotation(xj, yj);
									y[j]=yrotation(xj, yj);
									//System.out.printf("x[%d]=%d, y[%d]=%d\n",j, x[j],j, y[j]);
									if(basex[m+1-j]==x[j] && basey[m+1-j]==y[j]) {
										count++;
									}
								}//回転
								if(count==m) {
									check[i]=true;
									break;
								}
							}//90, 180, 270, 360回転
						}
						
						if(check[i]) break;
					}
					
				}
				for(int i=1; i<=n; i++) {
					if(check[i]) System.out.println(i);
				}
				System.out.println("+++++");
			}
		}
	}
}
