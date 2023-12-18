import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		long[] b = new long[m];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextLong();
		}
		long judge = 0;
		long count = 0;
		int i = 0;
		int j = 0;
		if(a[i] > k && b[i] > k) {
			System.out.println(count);
			return;
		}
		while(judge < k && count < n+m) {
			count++;
			if(i < n && j < m) {
				if(a[i] <= b[j]) {
					judge += a[i];
					i++;
				}
				else {
					judge += b[j];
					j++;
				}
			}
			else if(j >= m) {
				judge += a[i];
				i++;
			}
			else if(i >= n){
				judge += b[j];
				j++;
			}
		}
		if(judge > k) {
			count--;
		}
		System.out.println(count);
	}
}
