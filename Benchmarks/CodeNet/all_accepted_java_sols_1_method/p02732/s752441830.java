import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n + 1];
		int[] ball = new int[n];
		for(int i = 0; i < n; i++) {
			ball[i] = in.nextInt();
			a[ball[i]] += 1;
		}
		long ans = 0L;
		for(int i = 0; i <= n; i++) {
			ans += ((long) a[i] * (long) (a[i] - 1)) / 2;
		}
		for(int i = 0; i < n; i++) {
			if(a[ball[i]] == 1) System.out.println(ans);
			else {
				long newans = ans;
				newans -= ((long) a[ball[i]] * (long) (a[ball[i]] - 1)) / 2;
				newans += ((long) (a[ball[i]] - 1) * (long) (a[ball[i]] - 2)) / 2;
				System.out.println(newans);
			}
		}
	}
} 
