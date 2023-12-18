import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n-1; i++) {
			arr[i] = s.nextInt();
		}
		
		int max = -2000000000;
		int min = arr[0];
		
		for (int i = 1; i < n-1; i++) {
			max = Math.max(max, arr[i]-min);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println(max);
	}
}
