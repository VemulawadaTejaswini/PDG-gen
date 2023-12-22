import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] X = new int[N];
		int[] L = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = s.nextInt();
			L[i] = s.nextInt();
		}
		
		int[][] ps = new int[N][2];
		for(int i = 0; i < N; i++) {
			ps[i][0] = X[i] + L[i];
			ps[i][1] = X[i] - L[i];
		}
		Arrays.sort(ps, (a, b) -> Integer.compare(a[0], b[0]));
		
		int cur = -Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(cur <= ps[i][1]) {
				ans++;
				cur = ps[i][0];
			}
		}
		System.out.println(ans);
    }
}