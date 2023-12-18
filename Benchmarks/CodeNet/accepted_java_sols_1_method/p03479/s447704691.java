import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();

		int ans = 0;
		while (y >= x) {
			ans++;
			x = 2 * x;
		}

		System.out.println(ans);

	}

}
