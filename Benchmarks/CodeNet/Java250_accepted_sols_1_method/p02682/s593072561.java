import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();

		long ans = 0;
		ans += Math.min(a, k);
		k -= Math.min(a, k);
		k -= Math.min(b, k);
		ans -= Math.min(c, k);
		k -= Math.min(c, k);
		System.out.println(ans);
	}

}
