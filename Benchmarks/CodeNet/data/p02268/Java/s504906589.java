import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = scan.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < q; i++) {
			if (Arrays.binarySearch(S, T[i]) >= 0) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
		scan.close();
		
	}

}