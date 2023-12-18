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

		boolean[] multi = new boolean[n];
		Arrays.fill(multi, false);

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!multi[i]) {
				for (int j = 0; j < n; j++) {
					
					if (j != i && !multi[j]) {						
						if (a[i] % a[j] == 0)
							multi[i] = true;
						
						if (a[j] % a[i] == 0)
							multi[j] = true;

					}
				}
				if (!multi[i])
					count++;

			}
		}

		System.out.println(count);
	}
}
