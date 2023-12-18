import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int a[];
		int index;
		int count;
		int pass;

		n = sc.nextInt();
		m = sc.nextInt();
		while (n + m != 0) {
			index = -1;
			count = 0;
			pass = 0;
			a = new int[n];
			while (count < n - 1) {
				index++;
				index %= n;
				if (a[index] == 0) {
					pass++;
				}
				if (pass == m) {
					a[index] = 1;
					pass = 0;
					count++;
				}
			}
			for (int i = 0; i < n; i++) {
				if (a[i] == 0) {
					System.out.println(i + 1);
				}
			}
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}