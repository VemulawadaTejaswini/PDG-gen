import java.util.Scanner;

public class Main {

	static int w,h,xs,ys,xg,yg,n,c;
	static boolean f;
	static int[][] field;
	static int[] v1={0,1,0,-1};
	static int[] v2={1,0,-1,0};
	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
		while(true){
			f=false;
			w=cin.nextInt();
			h=cin.nextInt();
			if(w+h==0){
				break;
			}
			field=new int[w+2][h+2];
			xs=cin.nextInt();
			ys=cin.nextInt();
			xg=cin.nextInt();
			yg=cin.nextInt();
			n=cin.nextInt();
			for(int i = 0;i<n;i++){
				int c = cin.nextInt();
				int d = cin.nextInt();
				int x = cin.nextInt();
				int y = cin.nextInt();
				if(d==0){
					for(int j = 0;j<4;j++){
						for(int k = 0;k<2;k++){
							field[j+x][k+y]=c;
						}
					}
				}
				else{
					for(int j = 0;j<2;j++){
						for(int k = 0;k<4;k++){
							field[j+x][k+y]=c;
						}
					}
				}
			}
			for(int i = 0;i<w+2;i++){
				for(int j = 0;j<h+2;j++){
					//System.out.print(field[j][i]);
				}
				//System.out.println();
			}
			c = field[xs][ys];
			if(c==0){
				System.out.println("NG");
				continue;
			}
			dfs(xs,ys);
			if(f){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");
			}
				
		}
	}
	static void dfs(int x,int y){
		//System.out.println(field[x][y]+" " + x+" " + y);
		field[x][y]=0;
		if(x==xg&&y==yg){
			f=true;
		}
		for(int i = 0;i<4;i++){
			int xx=x+v1[i];
			int yy=y+v2[i];
			if(field[xx][yy]==c){
				dfs(xx,yy);
			}
		}
	}
}