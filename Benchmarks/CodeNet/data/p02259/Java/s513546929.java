import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					count++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(i == 0 ? arr[i] : " " + arr[i]);
		}
		System.out.println("\n"+count);

	}
}
