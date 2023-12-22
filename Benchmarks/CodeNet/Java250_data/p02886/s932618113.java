import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] arr = new int[n];
		int total = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				total += arr[i] * arr[j];
			}
		}

		System.out.println(total);

	}

}
