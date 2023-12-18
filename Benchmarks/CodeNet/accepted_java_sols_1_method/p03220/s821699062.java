import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		double a = sc.nextInt();
		double min = 1000000;
		int ans = 0;

		int h[] = new int[n];

		for (int i = 0;i<n ;i++ ) {
			h[i] = sc.nextInt();
		}

		for (int i = 0;i<n ;i++ ) {
			double data = t-h[i]*0.006;
			min = Math.min(min,Math.abs(a-data));
			if (min==Math.abs(a-data)) {
				 ans = i+1;
			}
		}

		System.out.println(ans);
	}
}
