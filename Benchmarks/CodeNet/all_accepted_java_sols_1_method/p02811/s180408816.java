import java.util.*;

public class Main {

	public static void main(String[] args) {

		/* System.out.println("数字を入力してください"); */
		Scanner scanner = new Scanner(System.in);

		long K = scanner.nextLong();
		long X = scanner.nextLong();
		if (X <= K * 500) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}