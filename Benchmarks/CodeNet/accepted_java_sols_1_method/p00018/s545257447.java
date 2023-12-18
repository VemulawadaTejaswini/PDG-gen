import java.util.Scanner;

public class Main {

	private static final int N = 5;

	public static void main(String[] args) {

		int[] arr = new int[N];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int s = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] < arr[j]) {
					s = arr[i];
					arr[i] = arr[j];
					arr[j] = s;
				}
			}
			System.out.print(arr[i] + (i < N - 1 ? " " : ""));
		}
		System.out.println(arr[N - 1]);

	}
}