import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * お遊び
 *
 * @author s-sugimoto
 */
public class Main {

	/**
	 * 隠蔽
	 */
	private Main() {
	}

	/**
	 * main
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		int result = 0;

		List<Integer> a = new ArrayList<>(Integer.parseInt(n));
		for (int i = 0; i < Integer.parseInt(n); i++) {
			int first = scanner.nextInt();
			int end = scanner.nextInt();
			result += end - first + 1;
		}

		System.out.println(result);
	}

}
