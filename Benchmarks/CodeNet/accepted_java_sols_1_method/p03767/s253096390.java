import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int n3 = 3 * n;
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n3];
		for (int i = 0; i < n3; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);

		long ans = 0;
		for (int i = n3 - 2; i >= n; i-=2) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}
