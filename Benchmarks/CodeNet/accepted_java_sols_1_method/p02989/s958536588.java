import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		int from, to;

		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}

		Arrays.sort(d);

		from = d[N / 2 - 1];
		to = d[N / 2];

		System.out.println(to - from);
	}
}
