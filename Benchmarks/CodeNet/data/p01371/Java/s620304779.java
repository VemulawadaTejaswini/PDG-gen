import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int N=sc.nextInt();
				if(N==0) break;
				double[][] dist=new double[N+2][N+2];
				double[][] dp=new double[1<<N][N+2];
				double inf=1e100;

				for(int i=1; i<=N; i++){
					for(int j=0; j<=N; j++){
						dist[j][i]=sc.nextInt();
					}
				}
				for(int i=0; i<(1<<N); i++){
					for(int j=0; j<=N; j++){
						dp[i][j]=inf;
					}
				}
				dp[0][0]=0;

				for(int i=0; i<(1<<N); i++){
					for(int j=0; j<=N; j++){
						if(dp[i][j]==inf) continue;
						for(int k=1; k<=N; k++){
							if((1&i>>(k-1))==1) {
								continue;
							}
							int nexti=i|(1<<(k-1));
							String str="";
			            for(int tt=0; tt<N; tt++){
			                if((1&nexti>>tt)==1) str+="1";
			                else str+="0";
			            }
			            //if(j==0) {
			            	double nextd=dp[i][j]+dist[j][k];
							dp[nexti][k]=Math.min(dp[nexti][k], nextd);
							dp[nexti][j]=Math.min(dp[nexti][j], nextd);
//			            }
//			            for(int jj=1; jj<=N; jj++) {
//			            	if((1&i>>(jj-1))==1) {
//							double nextd=dp[i][jj]+dist[jj][k];
//							dp[nexti][k]=Math.min(dp[nexti][k], nextd);
//			            	}
//			            	System.out.println(str+" "+"jj="+jj+"dp["+nexti+"]["+k+"]="+dp[nexti][k]);
//			            }
							//System.out.println(str+" "+"j="+j+"dp["+nexti+"]["+k+"]="+dp[nexti][k]+",["+j+"]="+dp[nexti][j]);
						}
					}
				}
				int all=(1<<N)-1;
				int min=(int)inf;
				for(int k=1; k<=N; k++) {
					min=Math.min((int)dp[all][k], min);
				}
				System.out.println(min);
			}


		}
	}
}
