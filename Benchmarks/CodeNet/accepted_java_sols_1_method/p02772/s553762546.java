import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			if (x % 2 == 0) {
				if (x % 3 != 0) {
					if (x % 5 != 0) {
						count += 1;
						//System.out.println(x);
					}
				}
			}
		}

		if (count > 0) {
			System.out.println("DENIED");
		} else {
			System.out.println("APPROVED");
		}
	}
}
