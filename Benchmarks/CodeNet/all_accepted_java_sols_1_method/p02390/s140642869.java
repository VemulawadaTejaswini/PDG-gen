import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			int intx = scanner.nextInt();

			if (0 <= intx && intx < 86400) {
				int inth = intx / 3600;
				int intm = intx % 3600 / 60;
				int ints = intx % 3600 % 60;

				System.out.println(inth + ":" + intm + ":" + ints);
			} else {
				System.out.println("正しい数値を入力してください。");
			}
	}
}

