import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var m = sc.nextInt();
		var k = sc.nextInt();
		var a = new int[n];
		var b = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		var amax = 0;
		var sum = 0L;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum > k) {
				sum -= a[i];
				break;
			}
			amax++;
		}

		var bmax = 0;
		for (int i = 0; i < m; i++) {
			sum += b[i];
			if (sum > k) {
				sum -= b[i];
				break;
			}
			bmax++;
		}

		//System.out.printf("%d %d %d\r\n", amax, bmax, sum);

		var max = amax + bmax;
		for (int i = amax - 1; i >= 0; i--) {
			sum -= a[i];
			for (int j = bmax; j < m; j++) {
				sum += b[j];
				if (sum > k) {
					sum -= b[j];
					break;
				}
				bmax++;
				max = Math.max(max, i + j + 1);
				//System.out.printf("%d %d %d\r\n", i, j + 1, sum);
			}
		}
		System.out.println(max);
	}
}
