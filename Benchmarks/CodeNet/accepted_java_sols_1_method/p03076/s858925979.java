import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] arr = new int[5];
		int minIndex = 0;
		int ans = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = reader.nextInt();
			if (arr[minIndex] % 10 > arr[i] % 10 && arr[i] % 10 != 0 || arr[minIndex] % 10 == 0) {
				minIndex = i;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (i == minIndex || arr[i] % 10 == 0) {
				ans += arr[i];
			} else {
				ans += arr[i] / 10 * 10 + 10;
			}
		}

		System.out.print(ans);
		reader.close();
	}
}



