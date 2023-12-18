import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ai;
		ai = new int[n];

		for (int i = 0; i < n; i++) {
			ai[i] = scan.nextInt();
		}

		//??????1???????????????????¬???????(" " + ai[j])
		System.out.print(ai[n - 1]);
		for (int j = n - 2; j >= 0; j--) {
			System.out.print(" " + ai[j]);
		}
		//????????????
		System.out.println();
	}

}