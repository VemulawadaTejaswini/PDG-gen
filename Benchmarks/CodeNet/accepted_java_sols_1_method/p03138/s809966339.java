import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();long[] a = new long[n];
		long k = sc.nextLong();
		for (int i = 0; i < n; i++) a[i] = sc.nextLong();
      
		long x = 0;
		for (int i = 39; i >= 0; i--) {
			int count = 0;
			for (int j=0;j<n;j++) count += (1 & (a[j] >> i));
			if (count <= n / 2) {
				if ((x| 1l << i) <= k)  x = x| 1l << i;
			}
		}
		long sum = 0;
		for(int i=0;i<n;i++) sum+=(x^a[i]);
		System.out.println(sum);
	}
}
