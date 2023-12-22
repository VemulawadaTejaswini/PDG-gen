
public class Main {
	public static void main(String[] args) {
		int N = new java.util.Scanner(System.in).nextInt();
		int temp = 0;
		boolean possible = false;
		final int MAX_A = N / 4;
		final int MAX_B = N / 7;

		for (int i = 0; i <= MAX_A; ++i) {
			for (int j = 0; j <= MAX_B; ++j) {
				temp = 4 * i + 7 * j;
				if (temp == N) {
					possible = true;
					break;
				}
			}
			if (possible) {
				break;
			}
		}
		if(possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
