import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static long mod = 998244353;
	static List<Integer> D = new ArrayList<Integer>();
	static long pattern[] = new long[200001];

	static long func(int N) {

		if(N <= 0) {
			return 0;
		} else if(pattern[N] != -1) {
			return pattern[N];
		} else {
			long ans = 0;
			for(int i=0; i<D.size(); i++) {
				ans += func(N-D.get(i));
				pattern[N] = ans%mod;
			}
			return ans%mod;
		}

	}

	public static void main(String[] args) {
		// AtCoder_D
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		for(int i=0; i<K; i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			for(int j=L; j<=R; j++) {
				D.add(j);
			}
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		Collections.sort(D, Collections.reverseOrder());
		Arrays.fill(pattern, -1);
		pattern[1] = 1;

		System.out.println(func(N));
	}
}
