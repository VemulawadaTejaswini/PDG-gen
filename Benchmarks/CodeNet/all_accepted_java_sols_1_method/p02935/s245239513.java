
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] V = new int[N];

		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}

		Arrays.sort(V);

		double result = V[0];
		for (int i = 1; i < N; i++) {
			result = (result + V[i]) / 2;
		}

		System.out.print(result);

	}
}
