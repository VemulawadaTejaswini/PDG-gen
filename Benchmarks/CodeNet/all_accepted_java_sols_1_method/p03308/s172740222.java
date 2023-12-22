
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			int min = Integer.MAX_VALUE;
			int max = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (a < min) {
					min = a;
				}
				if (max < a) {
					max = a;
				}
			}
			System.out.println(max - min);
		}
	}
}
