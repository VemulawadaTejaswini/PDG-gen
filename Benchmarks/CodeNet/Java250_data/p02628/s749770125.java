import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = scanner.nextInt();
		}

		Arrays.sort(ar);

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += ar[i];
		}

		System.out.println(sum);

	}

}