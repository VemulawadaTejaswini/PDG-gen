
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[in.nextInt() - 1] = i + 1;
		}

		System.out.print(arr[0]);
		for(int i = 1; i < n; i++)
			System.out.print(" " + arr[i]);
	}
}