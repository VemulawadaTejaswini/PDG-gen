import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int uhen = sc.nextInt();
		int jouhen = sc.nextInt();
		int sahen = 0;
		int teihen = 0;
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();

			switch (a) {
			case 1:
				sahen = Math.max(sahen, x);
				break;
			case 2:
				uhen = Math.min(uhen, x);
				break;
			case 3:
				teihen = Math.max(teihen, y);
				break;
			case 4:
				jouhen = Math.min(jouhen, y);
				break;
			}
		}
		if (!(sahen <= uhen && teihen <= jouhen)) {
			System.out.println(0);
		} else {
			System.out.println((uhen - sahen) * (jouhen - teihen));
		}

	}
}
