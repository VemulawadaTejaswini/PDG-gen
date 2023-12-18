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
				if (sahen < x)
					sahen = x;
				break;
			case 2:
				if (x < uhen)
					uhen = x;
				break;
			case 3:
				if (teihen < y)
					teihen = y;
				break;
			case 4:
				if (y < jouhen)
					jouhen = y;
				break;
			}
		}
		int height = (jouhen - teihen);
		int width = (uhen - sahen);
		if (height < 0) {
			height = 0;
		}
		if (width < 0) {
			width = 0;
		}
		System.out.println(height * width);
	}
}
