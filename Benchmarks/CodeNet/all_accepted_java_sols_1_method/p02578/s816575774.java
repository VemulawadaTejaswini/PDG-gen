
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long result = 0;
			int before = 0;
			for (int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				if (tmp < before) {
					result += before - tmp;
				} else {
					before = tmp;
				}
			}
			System.out.println(result);
		}
	}
}
