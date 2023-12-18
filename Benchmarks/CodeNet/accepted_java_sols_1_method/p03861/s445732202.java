import java.util.Scanner;

/**
 * https://abc048.contest.atcoder.jp/tasks/abc048_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		sc.close();
		long s = (a/x+(a%x==0 ? 0:1))*x;
		long e = (b/x)*x;
		long ans = e>=s ? (1+(e-s)/x) : 0;
		System.out.println(ans);

	}

}
