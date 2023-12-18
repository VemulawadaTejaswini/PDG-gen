import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int cnt = 0;
		for (int i = n - 1; 0 <= i; i--) {
			for (int j = i - 1; 0 <= j; j--) {
				if (a[i] % a[j] == 0) {
					cnt++;
					break;
				}
			}
		}

		System.out.println(n - cnt);

		sc.close();
	}

}
