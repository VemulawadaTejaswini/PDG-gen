import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		int b[] = new int[n];
		for(int i = 0; i < n + 1; ++i)
			a[i] = sc.nextInt();
		for(int i = 0; i < n; ++i)
			b[i] = sc.nextInt();
		sc.close();
		long ans = 0;
		for(int i = 0; i < n; ++i) {
			long tmp = (long)a[i] + (long)a[i + 1];
			if(b[i] >= tmp) {
				ans += tmp;
				a[i + 1]=0;
			}
			else {
				if(a[i] <= b[i]) 
					a[i + 1] -= (b[i] - a[i]);
				ans += (long)b[i];
			}
		}
		System.out.println(ans);
	}
}
