import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = (long)N*(N+1)*(N+2)/6;
		for (int i=0;i<N-1;i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			if (u>v) {
				int tmp = u;
				u = v;
				v = tmp;
			}
			ans -= (long)(u+1)*(N-v);
		}
		System.out.println(ans);
	}
}
