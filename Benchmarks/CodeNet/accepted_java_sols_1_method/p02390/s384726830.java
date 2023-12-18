import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();

		if (S < 0 || S >= 86400) {
			System.out.println("0以上もしは、86400より小さい数を入力してください。");
		} else {

			int h = 0;
			int m = 0;
			int s = 0;

			h = (S / 3600);
			m = (S % 3600) / 60;
			s = (S % 3600) % 60;

			System.out.println(h + ":" + m + ":" + s);
		}

	}

}

