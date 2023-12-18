import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String answer = "Three";
		Scanner sc = new Scanner(System.in);
		int hina = sc.nextInt();
		int p = 0;	// 桃色
		int w = 0;	// 白色
		int g = 0;	// 緑色
		int y = 0;	// 黄色

		String tmp;
		for (int i = 0; i < hina; i++) {
			tmp = sc.next();
			// ひなあられの文字列判定
			switch (tmp) {
			case "P":
				if (p > 0) break;
				p++;
				break;

			case "W":
				if (w > 0) break;
				w++;
				break;

			case "G":
				if (g > 0) break;
				g++;
				break;

			case "Y":
				if (y > 0) break;
				y++;
				break;

			}
			// 4種類だと確定した場合スキップ
			if (p + w + g + y == 4) {
				answer = "Four";
				break;
			}

		}

		System.out.println(answer);

	}

}