import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n > 0) {
			int count[] = new int[10];

			for (int i = 0; i < n; ++i) {
				int ice = sc.nextInt();
				count[ice]++;
			}

			for (int ice = 0; ice < 10; ++ice) {
				if (count[ice] == 0) {
					System.out.println("-");
				} else {
					for (int j = 0; j < count[ice]; ++j) {
						System.out.print("*");
					}
					System.out.println();
				}
			}

			n = sc.nextInt();
		}
	}
}

