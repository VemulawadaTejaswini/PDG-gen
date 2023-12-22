import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		for(int i = 0; i < n; ++i)
		v[i] = sc.nextInt();
		sc.close();
		Arrays.sort(v);
		long w = 1;
		double ans = 0.0;
		for(int i = n - 1; i > 0; --i){
			w <<= 1;
			int tmp = v[i];
			ans += (double)tmp / (double)w;
		}
		ans += (double)v[0] / (double)w;
		System.out.println(ans);
	}
}
