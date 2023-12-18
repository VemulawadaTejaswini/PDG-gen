
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long l = sc.nextLong();
			long r = sc.nextLong();
			long sub = r - l;

			if (2019 < sub) {
				System.out.println(0);
				return;
			}

			long result = 2020;
			for (long i = l; i < r; i++) {
				if (i % 2019 == 0) {
					System.out.println(0);
					return;
				}
				for (long j = i + 1; j <= r; j++) {
					if ((i * j) % 2019 < result) {
						result = (i * j) % 2019;
					}
				}
			}

			System.out.println(result);
		}
	}
}
