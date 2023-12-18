
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();

			if (x < 3) {
				System.out.println("1");
				return;
			}

			int y = (int)Math.sqrt(x);
			int result = y * y;
			for (int i = 2; i <= y; i++) {
				int tmp = i;
				while(tmp <= x){
					tmp *= i;
				}
				tmp /= i;

				if (result < tmp) {
					result = tmp;
				}
			}

			System.out.println(result);
		}
	}
}
