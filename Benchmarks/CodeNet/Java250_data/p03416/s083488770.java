import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();

		int au = a / 1000;
		int aur = au % 10 * 10 + au / 10;
		int am = a / 100 % 10;
		int al = a % 100;
		if (aur < al) {
			am++;
			if (am == 10) {
				am = 0;
				au++;
			}
		}

		int bu = b / 1000;
		int bur = bu % 10 * 10 + bu / 10;
		int bm = b / 100 % 10;
		int bl = b % 100;
		if (bur > bl) {
			bm--;
			if (bm == -1) {
				bm = 9;
				bu--;
			}
		}

		int num = (bu - au - 1) * 10 + 11 - am + bm;

		System.out.println(num);
	}
}
