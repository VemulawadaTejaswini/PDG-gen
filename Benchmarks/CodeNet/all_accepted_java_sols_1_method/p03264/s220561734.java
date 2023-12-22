
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();

			int odd = 0;
			int even = 0;

			for (int i = 1; i <= k; i++) {
				if(i % 2 == 0) {
					odd++;
				} else {
					even++;
				}
			}


			System.out.println(odd * even);
		}
	}
}
