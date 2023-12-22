
import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		sc.nextInt();
		int M = sc.nextInt();

		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;

		for (int i = 0; i < M; i++) {
			min = Math.max(min, sc.nextInt());
			max = Math.min(max, sc.nextInt());
		}

		System.out.println(min <= max ? max - min + 1 : 0);

	}
}