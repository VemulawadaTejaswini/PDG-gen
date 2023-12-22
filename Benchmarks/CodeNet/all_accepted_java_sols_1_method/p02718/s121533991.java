import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int p = m;
		int[] a = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			count += j;
			a[i] = j;
		}
		for (int b : a) {
			if (count / (4.0 * m) <= b) {
				p -= 1;
			}
		}
		if (p <= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		kb.close();
	}
}
