import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] ar = new long[n];
		for(int i = 0; i < n; i++) {
			ar[i] = in.nextLong();
		}
		Arrays.sort(ar);
		long ans = ar[n - 1];
		int newn = n - 2;
		int i = n - 2;
		while(newn > 0) {
			if((newn - 2) >= 0) {
				newn -= 2;
				ans += ar[i] * 2;
			}else {
				newn -= 1;
				ans += ar[i];
			}
			i -= 1;
		}
		System.out.println(ans);
	}
}