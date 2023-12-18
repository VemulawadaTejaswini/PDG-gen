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

		int manysti = 0;
		long st[] = new long[2];
		st[1]=0;
		st[0]=0;
		for (int i = n - 1; i >= 1; i--) {
			if (a[i] == a[i - 1]) {

				st[manysti] = a[i];
				i--;
				manysti++;
				if (manysti == 2) {
					break;
				}
			}
		}

		System.out.println(st[0]*st[1]);
	}
}