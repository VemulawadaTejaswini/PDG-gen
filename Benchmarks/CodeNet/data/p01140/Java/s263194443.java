// Square Route
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if ((N | M) == 0)
				break;
			int[] h = new int[N];
			int[] w = new int[M];
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				h[i] = sc.nextInt();
				int t = 0;
				for (int j = i; j >= 0; j--) {
					t += h[j];
					list.add(t);
				}
			}
			int n = list.get(list.size() - 1) + 1;
			int[] results = new int[n];
			int result = 0;
			for (int i = 0; i < list.size(); i++)
				results[list.get(i)]++;
			for (int i = 0; i < M; i++) {
				w[i] = sc.nextInt();
				int t = 0;
				for (int j = i; j >= 0; j--) {
					t += w[j];
					if (t <= n)
						result += results[t];
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}