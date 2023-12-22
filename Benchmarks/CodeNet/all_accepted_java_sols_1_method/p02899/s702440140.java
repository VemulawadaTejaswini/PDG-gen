import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] ans = new int[n];
		int ninzuu = 0;
		for (int i = 0; i < n; i++) {
			ninzuu = Integer.parseInt(sc.next());
			ans[n - ninzuu] = i + 1;
		}

		System.out.print(ans[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			System.out.print(" " + ans[i]);
		}
		System.out.println();

	}

}
