import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int ai = sc.nextInt();
				if (ai % 2 == 0) {
					if (ai % 3 == 0 || ai % 5 == 0) {
					} else {
						System.out.println("DENIED");
						return;
					}
				}
			}
			System.out.println("APPROVED");
		}
	}

}
