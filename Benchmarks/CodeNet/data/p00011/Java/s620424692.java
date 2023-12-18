import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int a[];

		n = sc.nextInt();
		k = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		for (int i = 0; i < k; i++) {
			String st = sc.next();
			int swap = a[(st.charAt(0) - '0') - 1];
			a[(st.charAt(0) - '0') - 1] = a[(st.charAt(2) - '0') - 1];
			a[(st.charAt(2) - '0') - 1] = swap;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}