import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		boolean possible = true;

		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (!(num[j] - num[i] <= k)) possible = false;
			}
		}

		if (possible) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}
