import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		
		a[0] = sc.nextInt();
		for (int i = 1; i < n; i++) {
			a[i] = a[i-1] + sc.nextInt();
		}
		b[0] = sc.nextInt();
		for (int i = 1; i < m; i++) {
			b[i] = b[i-1] + sc.nextInt();
		}
		sc.close();
		
		int ans = 0;
		
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if(j > 0) j--;
			if(a[i] > k) break;
			ans = Math.max(ans, i+1);
			for (; j < b.length; j++) {
				if(a[i] + b[j] > k) {
					break;
				}
				ans = Math.max(ans, i+j+2);
			}
		}

		for (j = 0; j < b.length; j++) {
			if(b[j] > k) {
				break;
			}
			ans = Math.max(ans, j+1);
		}
		System.out.println(ans);
	}

}