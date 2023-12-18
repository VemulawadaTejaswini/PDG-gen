
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(String.format("Case %d:", i));
			int num = scanner.nextInt();
			int s = 10;
			while (s-- > 0) {
				num = num * num / 100 % 10000;
				System.out.println(num);
			}
		}
	}
}