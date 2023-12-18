import java.util.Scanner;

// https://atcoder.jp/contests/abc167/tasks/abc167_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		sc.close();

//		long startTime = System.currentTimeMillis();

		long ans = 0L;

		if(a>=k) {
			ans = ans + 1L*k;
			System.out.println(ans);
			return;
		}else {
			ans = ans + 1L*a;
			k = k-a;
			if(b>=k) {
				System.out.println(ans);
				return;
			}else {
				k = k-b;
				if(c>=k) {
					ans = ans - 1L*k;
					System.out.println(ans);
					return;
				}else {
					ans = ans - 1L*c;
					System.out.println(ans);
					return;
				}
			}
		}
	}
}
