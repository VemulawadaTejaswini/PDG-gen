import java.util.Scanner;


public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		long k = scan.nextLong();
		long ans = 0;
		long read = 0;
		long[] a = new long[n];
		long[] b = new long[m];
		int indexA = 0;
		int indexB = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		for(int i = 0; i < m; i++) {
			b[i] = scan.nextLong();
		}
		
		while(read < k) {
			if(indexA == n && indexB == m) break; 
			if(n == indexA) { 
				read = read + b[indexB];
				ans++;
				indexB++;
				continue;
			}
			if(m == indexB) {
				read = read + a[indexA];
				ans++;
				indexA++;
				continue;
			}			
			// AもBも配列要素数内であるとき
			if(a[indexA] < b[indexB]) {
				read = read + a[indexA];
				ans++;
				indexA++;
			} else {
				read = read + b[indexB];
				ans++;
				indexB++;
			}
		}
		// read > kのとき減算
		if(read > k) {
			ans--;
		}
		System.out.print(ans);
	}
}