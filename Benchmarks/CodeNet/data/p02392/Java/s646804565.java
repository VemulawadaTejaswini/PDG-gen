import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < 0 || c > 100) {
			System.out.println("１つ目の値には１以上、3つ目の値には100以下の数字を入力してください。");
		} else if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

