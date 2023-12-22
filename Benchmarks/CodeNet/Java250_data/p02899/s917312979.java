import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = Integer.parseInt(scan.nextLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			int[] arr2 = new int[n];
			for (int i = 0; i < n; i++) {
				arr2[arr[i] - 1] = i + 1;
			}
			for (int i = 0; i < n; i++)
				System.out.print(arr2[i] + " ");
		}
	}
}
