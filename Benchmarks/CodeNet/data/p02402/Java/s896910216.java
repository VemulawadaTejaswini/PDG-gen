import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		int sum = 0;
		int max = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int arr[] = new int[n];
		if (n > 0 && n <= 10000) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= -1000000 && arr[i] <= 1000000) {
					Arrays.sort(arr);
					min = arr[0];
					max = arr[arr.length - 1];
					sum += arr[i];
				}
			}

			System.out.println(min + " " + max + " " + sum);
		}

	}

}