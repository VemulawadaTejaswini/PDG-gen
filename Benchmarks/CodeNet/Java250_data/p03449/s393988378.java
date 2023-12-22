import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[2][N];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < N; j++) A[i][j] = sc.nextInt();
		}
		int[] upper_sum = new int[N];
		int[] lower_sum = new int[N];
		for(int i = 0; i < N; i++) {
			upper_sum[i] = (i == 0) ? A[0][i] : upper_sum[i - 1] + A[0][i];
		}
		for(int i = N - 1; i >= 0; i--) {
			lower_sum[i] = (i == N - 1) ? A[1][i] : lower_sum[i + 1] + A[1][i];
		}
		int ans = 0;
		for(int i = 0; i < N; i++) {
			ans = Math.max(ans, upper_sum[i] + lower_sum[i]);
		}
		System.out.println(ans);
	}
}