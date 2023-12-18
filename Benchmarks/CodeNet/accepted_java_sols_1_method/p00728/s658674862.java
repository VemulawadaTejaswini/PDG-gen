import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int max = 0, min = 1000, sum = 0;
			for (int i = 0; i < n; i++) {
				int score = sc.nextInt();
				sum += score;
				if (max < score)
					max = score;
				if (min > score)
					min = score;
			}
			System.out.println((sum - max - min) / (n - 2));
		}
	}
}