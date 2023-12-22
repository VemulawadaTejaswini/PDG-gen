import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		//		long ans = Math.max(a * b, a * c);
		long ans = Math.max(a * c, a * d);
		ans = Math.max(ans, b * c);
		ans = Math.max(ans, b * d);
		//		ans = Math.max(ans, c * d);

		System.out.println(ans);
	}

}
