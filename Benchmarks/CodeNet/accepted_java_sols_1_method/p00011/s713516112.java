import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\D");

		int w = sc.nextInt();
		int n = sc.nextInt();

		int[] amida;
		amida = new int[w];

		for (int i = 0; i < w; i++) {
			amida[i] = i + 1;
		}

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int t = amida[a-1];
			amida[a-1] = amida[b-1];
			amida[b-1] = t;
		}

		for (int i = 0; i < w; i++)
			System.out.printf("%d\n", amida[i]);

	}
}