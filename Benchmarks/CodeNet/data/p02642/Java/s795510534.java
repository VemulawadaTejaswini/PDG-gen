import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			if (i != n - 1) {
				for (int j = 0; j < i + 2; j++) {
					if (j != i) {
						if (a[i] % a[j] == 0) {
							flag = false;
							break;
						}
					}
				}
			} else {
				for (int j = 0; j < i; j++) {
					if (a[i] % a[j] == 0) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}

}