import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextInt();
		long t[] = new long[N];
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
		}
		
		long ans = 0;
		for(int i = 0; i < N - 1; i++) {
			if(t[i + 1] - t[i] >= T) {
				ans += T;
			} else {
				ans += t[i + 1] - t[i];
			}
		}
		ans += T;
		System.out.println(ans);
	}
}
