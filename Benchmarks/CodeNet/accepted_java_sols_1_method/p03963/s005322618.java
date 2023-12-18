import java.util.Scanner;

/**
 * https://abc046.contest.atcoder.jp/tasks/abc046_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		long ans = (long) (K*Math.pow(K-1, N-1));
		System.out.println(ans);

	}

}
