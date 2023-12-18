import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < M; i++) {
			max = Math.max(max, sc.nextInt());
			min = Math.min(min, sc.nextInt());
		}

		if (min < max) {
			System.out.println(0);
		} else {
			System.out.println(min - max + 1);
		}

	}
}
