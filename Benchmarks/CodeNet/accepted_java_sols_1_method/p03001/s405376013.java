
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long w = sc.nextLong();
			long h = sc.nextLong();
			long x = sc.nextLong();
			long y = sc.nextLong();

			double result1 = (double)(w * h) / 2;
			int result2 = 0;
			if (w % 2 == 0 && w / 2 == x && h % 2 == 0 && h / 2 == y) {
				result2 = 1;
			}
			System.out.println(result1 + " " + result2);
		}
	}

}
