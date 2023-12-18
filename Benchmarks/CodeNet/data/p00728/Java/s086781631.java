import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
			}
			int max = 0, min = 1000, sum = 0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i];
				if (scores[i] > max)
					max = scores[i];
				if (scores[i] < min)
					min = scores[i];
			}
			System.out.println((sum - max - min) / (n - 2));
		}
	}
}