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

		int happychild = 0;

		for (int i = 0; i < a.length; i++) {
			x -= a[i];
			if(x < 0) {
				break;
			}
			happychild++;
		}
		if (x > 0) {
			happychild -= 1;
		}
		System.out.println(happychild);
	}
}
