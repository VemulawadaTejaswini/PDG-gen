import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int sum = 0;
		int max = 0;
		int min = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		if (n > 0 && n <= 10000) {
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] >= -1000000 && arr[i] <= 1000000) {
					count += 1;
					sum += arr[i];
				} else {
					count = -1;
					break;
				}

			}
			if (count != -1) {
				Arrays.sort(arr);
				min = arr[0];
				max = arr[arr.length - 1];
				System.out.println(min + " " + max + " " + sum);
			}

		}

	}

}