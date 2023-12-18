import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		long k = stdIn.nextLong();

		long[] a = new long[n];

		long[] b = new long[m];

		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextLong();
		}

		for(int i = 0; i < m; i++) {
			b[i] = stdIn.nextLong();
		}


		int indexa = 0;
		int indexb = 0;

		long cnt = 0;
		long time = 0;

		for(int i = 0; i < n+m; i++) {

			if(indexb == m) {
				for(int j = indexa; j < n; j++ ) {
					if(time + a[indexa] <= k) {
						time += a[indexa];
						indexa++;
						cnt++;
					}else {
						break;
					}
				}
			}

			if(indexa == n) {
				for(int j = indexb; j < m; j++ ) {
					if(time + b[indexb] <= k) {
						time += b[indexb];
						indexb++;
						cnt++;
					}else {
						break;
					}
				}
			}

			if(indexa < n && a[indexa] <= b[indexb] && time + a[indexa] <= k) {
				time += a[indexa];
				indexa++;
				cnt++;
				continue;

			}

			if(indexb < m && b[indexb] <= a[indexa] && time + b[indexb] <= k) {
				time += b[indexb];
				indexb++;
				cnt++;
				continue;
			}

			if(indexa+indexb == n+m)break;


		}

		System.out.println(cnt);


	}

}
