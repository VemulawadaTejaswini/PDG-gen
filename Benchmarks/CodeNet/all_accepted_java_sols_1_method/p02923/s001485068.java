
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int result = 0;
			int count = 0;
			long before = 0;
			for (int i = 0; i < n; i++) {
				long tmp = sc.nextLong();
				if (tmp <= before) {
					count++;
				} else {
					if (result < count) {
						result = count;
					}
					count = 0;
				}
				before = tmp;
			}
			if (result < count) {
				result = count;
			}
			System.out.println(result);
		}
	}
}
