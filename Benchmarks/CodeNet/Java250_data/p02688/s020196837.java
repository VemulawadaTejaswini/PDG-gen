import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] snuke = new boolean[N];
		for (int i=0;i<K;i++) {
			int d = sc.nextInt();
			for (int j=0;j<d;j++) {
				int A = sc.nextInt()-1;
				snuke[A] = true;
			}
		}
		int ans = 0;
		for (int i=0;i<N;i++) {
			if (!snuke[i]) ans++;
		}
		System.out.println(ans);
	}
}