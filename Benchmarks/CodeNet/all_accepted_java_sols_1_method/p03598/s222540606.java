import java.util.Scanner;

/**
 * https://abc074.contest.atcoder.jp/tasks/abc074_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for(int i=0; i<N; i++) x[i] = sc.nextInt();
		sc.close();
		
		long ans = 0;
		
		for(int i=0; i<N; i++){
			ans += Math.min(x[i]*2, (K-x[i])*2);
		}
		
		System.out.println(ans);

	}

}