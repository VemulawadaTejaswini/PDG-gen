import java.util.Scanner;

public class Main{
	static int h,w;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n= sc.nextInt();
				int m = sc.nextInt();
				int t = sc.nextInt();
				int p = sc.nextInt();
				if(n+m+t+p==0)break;
				h = m;
				w = n;
				int[][] paper = new int[m+1][n+1];
				for(int i=0;i<m;i++)
					for(int k =0;k<n;k++)
						paper[i][k] = 1;

				while(t--!=0) {
					int d = sc.nextInt();
					int c = sc.nextInt();
					if(d==2) {
						int k=h-1+h-1-c-c+1;
						if(h>=2*c) {
							for(int i=h-c-1;i>=h-c-c;i--) {
								for(int j=0;j<w;j++) {
									//  System.out.println(i+" "+j);
									paper[i][j] += paper[k-i][j];
									//System.out.println("paper["+i+"]["+j+"]="+paper[i][j]);
								}
							}
							h-=c;
						}
						else{
							for(int i=h-c-1; i>=0; i--) {
								for(int j=0; j<w; j++) {
									paper[k-i][j]+=paper[i][j];
								}
							}
							int[][] copy=new int [h][w];
							for(int i=h-c; i<h; i++) {
								for(int j=0; j<w; j++) {
									copy[i][j]=paper[i][j];
								}
							}
							for(int i=0; i<c; i++) {
								for(int j=0; j<w; j++) {
									paper[i][j]=copy[h-i-1][j];
								}
							}
							h=c;
						}
						//System.out.println("h="+h);
					}
					else if(d==1) {
						int l=w-1+w-1-c-c+1;
						if(w>=2*c) {
							for(int i=0;i<h;i++) {
								for(int j=w-c-1; j>=w-c-c; j--) {
									paper[i][j] += paper[i][l-j];
									//System.out.println("paper["+i+"]["+j+"]="+paper[i][j]);
								}
							}
							w-=c;
						}
						else {
							for(int i=0; i<h; i++) {
								for(int j=w-c-1; j>=0; j--) {
									paper[i][l-j]+=paper[i][j];
								}
							}
							int[][] copy=new int [h][w];
							for(int i=0; i<h; i++) {
								for(int j=w-c; j<w; j++) {
									copy[i][j]=paper[i][j];
								}
							}
							for(int i=0; i<h; i++) {
								for(int j=0; j<c; j++) {
									paper[i][j]=copy[i][w-j-1];
								}
							}
							w=c;
						}
						//System.out.println("w="+w);
					}
				}
//				for(int i=0; i<h; i++) {
//					for(int j=0; j<w; j++) {
//						System.out.println("paper["+i+"]["+j+"]="+paper[i][j]);
//					}
//				}

				while(p--!=0) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					//System.out.println(h+" "+w);
					System.out.println(paper[h-1-y][w-1-x]);
				}
			}




		}
	}
}
