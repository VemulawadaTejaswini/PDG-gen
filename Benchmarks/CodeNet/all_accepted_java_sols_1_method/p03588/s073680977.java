import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int max=0, a, b, n, amax = 0;
		n = stdin.nextInt();
		for (int i = 0; i < n; i++) {
			a = stdin.nextInt();
			b = stdin.nextInt();
			if (a > amax) {
				amax = a;
				max = a + b;
			}

		}
		System.out.println(max);

	}

}
