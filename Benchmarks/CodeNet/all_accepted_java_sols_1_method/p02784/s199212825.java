import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int n = sc.nextInt();

		String re = "No";
		int k = 0;
		for (int i = 0; i < n; i++) {
			k = k + sc.nextInt();
		}
		if (k >= h) {
			re = "Yes";
		}

		System.out.println(re);

	}

}