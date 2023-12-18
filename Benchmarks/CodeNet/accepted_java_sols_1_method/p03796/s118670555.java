import java.util.Scanner;

/**
 * https://abc055.contest.atcoder.jp/tasks/abc055_b
 */
public class Main {
	
	static final int MOD = 1000000007;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long n = 1;
		for(int i=1; i<=N; i++){
			n = n*i % MOD;
		}
		
		System.out.println(n);
	}
	
}