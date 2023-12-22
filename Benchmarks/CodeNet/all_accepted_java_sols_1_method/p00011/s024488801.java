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
			int left = 0, right = 0;
			for (int j = 0; ; j++) {
				left *= 10;
				left += st.charAt(j) - '0';
				if (st.charAt(j + 1) == ',') {
					for (int l = j + 2; l < st.length(); l++) {
						right *= 10;
						right += st.charAt(l) - '0';
					}
					break;
				}
			}
			int swap = a[left - 1];
			a[left - 1] = a[right - 1];
			a[right - 1] = swap;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}