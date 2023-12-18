import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int[] T = new int[N];
			for (int i = 0; i < N; ++i) {
				T[i] = sc.nextInt();
			}
			Arrays.sort(T);
			int cur = 0;
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				cur += T[i];
				ans += cur;
			}
			System.out.println(ans);
		}
	}

}