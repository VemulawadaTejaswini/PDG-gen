import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;
		int curMin = 0;
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			if (i == 0) {
				curMin = p;
				cnt++;
				continue;
			}
			if (p < curMin) {
				curMin = p;
				cnt++;
			}
		}

		System.out.println(cnt);

	}

}