import java.util.Scanner;

/**
 * https://arc090.contest.atcoder.jp/tasks/arc090_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[2][N];
		for(int i=0; i<N; i++) a[0][i] = sc.nextInt();
		for(int i=0; i<N; i++) a[1][i] = sc.nextInt();
		sc.close();
		
		int[] dp1 = new int[N];
		int[] dp2 = new int[N];
		dp1[0] = a[0][0];
		dp2[0] = a[1][0];
		for(int i=1; i<N; i++){
			dp1[i] = a[0][i]+dp1[i-1];
			dp2[i] = a[1][i]+dp2[i-1];
		}
		
		int max = 0;
		for(int i=0; i<N; i++){
			int target = i==0 ? dp1[i]+dp2[N-1] : dp1[i]+dp2[N-1]-dp2[i-1];
			max = Math.max(max, target);
		}
		System.out.println(max);
		

	}

}