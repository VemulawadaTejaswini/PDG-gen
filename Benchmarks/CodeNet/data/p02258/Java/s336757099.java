import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int R[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			R[i]  = scan.nextInt();
		}

		int ans = 0;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				ans = Math.max(ans, R[j] - R[i]);
			}
		}

		System.out.println(ans);
		scan.close();
	}

}