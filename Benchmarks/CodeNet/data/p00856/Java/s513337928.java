import java.util.Arrays;
import java.util.Scanner;

public class Main{
	Scanner sc=new Scanner(System.in);

	int n, turn;
	int[] board;

	// 0:normal
	// 1:L
	// 2:B

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			turn=sc.nextInt();
			int lose=sc.nextInt();
			int back=sc.nextInt();
			board=new int[200];
			for(int i=0; i<lose; i++){
				board[sc.nextInt()]=1;
			}
			for(int i=0; i<back; i++){
				board[sc.nextInt()]=2;
			}
			solve();
		}
	}

	void solve(){
		double[] dp1=new double[400];
		double[] dp2=new double[400];
		dp1[0]=1.0;
		for(int i=0; i<turn; i++){
			System.arraycopy(dp1, 0, dp2, 0, 400);
			Arrays.fill(dp1, 0.0);
			// dp2æèdp1ðXV
			for(int x=0; x<400; x++){
				if(dp2[x]==0.0){
					continue;
				}
				// S[
				if(x==n){
					dp1[x]+=dp2[x];
				}
				// xÝ
				else if(x>=200){
					dp1[x-200]+=dp2[x];
				}
				// »Ì¼
				else{
					for(int d=1; d<=6; d++){
						int nx=x+d;
						if(nx>n){
							int over=nx-n;
							nx=n-over;
						}
						if(board[nx]==1){
							nx+=200;
						}else if(board[nx]==2){
							nx=0;
						}
						dp1[nx]+=dp2[x]/6.0;
					}
				}
			}
			/*
			 * for(int k=0; k<=n; k++){ print(dp1[k]+","); } println("");
			 * for(int k=0; k<=n; k++){ print(dp1[200+k]+","); } println("");
			 */
		}
		/*
		 * long sum=0; for(int i=0; i<400; i++){ sum+=dp1[i]; } double
		 * ans=(double)dp1[n]/sum;
		 */
		println(""+dp1[n]);
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}