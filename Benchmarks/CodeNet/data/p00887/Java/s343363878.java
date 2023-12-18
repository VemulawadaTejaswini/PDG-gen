import java.util.Scanner;

public class Main {

	static int S ;
	static double EPS=1e-9;

	static boolean gauss(double[][] A) {
		for(int i=0; i<S; i++) {
			int pivot=i;
			for(int j=i; j<S; j++) {
				if(Math.abs(A[j][i])>Math.abs(A[pivot][i])) {
					pivot=j;
				}
			}
			for(int j=0; j<S+1; j++) {
				double a=A[i][j];
				A[i][j]=A[pivot][j];
				A[pivot][j]=a;
			}

			if(Math.abs(A[i][i])<EPS) {
				return false;
			}
			
			for(int j=i+1; j<S+1; j++) {
				A[i][j]/=A[i][i];
			}
			A[i][i]/=A[i][i];//基準値を1にする
			
//			for(int x=0; x<S; x++) {
//				for(int y=0; y<S+1; y++) {
//					System.out.print(A[x][y]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();

			for(int j=0; j<S; j++) {
				if(i!=j) {
					for(int k=i+1; k<S+1; k++) {
						A[j][k]-=A[j][i]*A[i][k];
					}
					A[j][i]-=A[j][i]*A[i][i];
				}
			}
		}
		return true;
	}


	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int m=sc.nextInt();
				int n=sc.nextInt();
				int d=sc.nextInt();
				if(m==0) break;
				int[][] s=new int[n][m];
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						s[i][j]=sc.nextInt();
					}
				}
				S=n*m;
				double[][] mt=new double[m*n][m*n+1];
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						if(s[i][j]==1) {
							mt[i*m+j][n*m]=1;
							//System.out.println("mt["+(i*m+j)+"]["+n*m+"]=1");
						}
					}
				}
				
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						mt[i*m+j][i*m+j]=1;
						//System.out.println("mt["+(i*m+j)+"]["+(i*m+j)+"]=1");
						for(int k=0; k<=d; k++) {
							for(int l=0; l<4; l++) {
								int ny=i+((l&1)==1? k:-k);
								int nx=j+(((l>>1)&1)==1 ? d-k:k-d);
								if(0<=ny && ny<n && 0<=nx && nx<m) {
									mt[ny*m+nx][i*m+j]=1;
								}
							}
						}
					}
				}
//				for(int i=0; i<S; i++) {
//					for(int j=0; j<S+1; j++) {
//						System.out.print(mt[i][j]+" ");
//					}
//					System.out.println();
//				}
//				System.out.println();
				System.out.println(gauss(mt)? 1:0);
			}
		}
	}
}
