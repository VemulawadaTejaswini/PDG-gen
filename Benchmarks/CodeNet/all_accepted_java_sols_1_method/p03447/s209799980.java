import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int ttl = sc.nextInt();
		int cake = sc.nextInt();
		int dnt = sc.nextInt();

		ttl = ttl-cake;
		ttl = ttl%dnt;

		System.out.println(ttl);

		sc.close();
	}
}
