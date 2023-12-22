import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int n = 0;
		for (int i = 0; i < N - 1; i++) {
			if (x >= a[i]) {
				n++;
			}
			x -= a[i];
			if(x <= 0) {
				break;
			}
		}

		if (x > 0 && x == a[N - 1]) {
			n++;
		}

		System.out.println(n);

		return;
	}

}
