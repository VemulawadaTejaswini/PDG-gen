import java.util.*;
class Problem2555 {
	public class T{
		int a,b,c;
		T(int a,int b,int c){
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		M = sc.nextInt();
		N = sc.nextInt();
		int[][][] need = new int[M][N][2];
		for(int i = 0 ; i < M ; i++){
			for(int j = 0 ; j < N ; j++){
				need[i][j][0] = 0;
				need[i][j][1] = (int)1e9;
			}
		}

		for(int i = 0 ; i < M ; i++){
			int K = sc.nextInt();
			for(int j = 0 ; j < K ; j++){
				int a = sc.nextInt() - 1;
				String b = sc.next();
				int c = sc.nextInt();
				if( b.equals(">=") ){
					need[i][a][0] = Math.max(need[i][a][0],c);
				}else{
					need[i][a][1] = Math.min(need[i][a][1],c);
				}
			}
			// mujun
			for(int j = 0 ; j < N ; j++){
				if( need[i][j][0] > need[i][j][1] ){
					System.out.println("No");
					return;
				}
			}
		}
		//if(1>0)return;
		int[][] wf = new int[M][M];

		for(int i = 0 ; i < M ; i++){
			for(int j = 0 ; j < M ; j++){
				for(int k = 0 ; k < N ; k++){
					if( need[i][k][1] < need[j][k][0] ){
						wf[i][j] = 1;
					}
				}
			}
		}
		for(int i = 0 ; i < M ; i++){
			for(int j = 0 ; j < M ; j++ ){
				for(int k = 0 ; k < M ; k++){
					wf[j][k] |= wf[j][i] & wf[i][k];
				}
			}
		}
		for(int i = 0 ; i < M ; i++)
			if( wf[i][i] > 0 ){
				System.out.println("No");
				return;
			}
		System.out.println("Yes");
		return;
	}
}