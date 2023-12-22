import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++ ) {
			h[i] = scanner.nextInt();
		}
		int highest = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (h[i] >= highest) {
				result++;
				highest = h[i];
			}
		}
		
		System.out.println(result);
		
	}

}