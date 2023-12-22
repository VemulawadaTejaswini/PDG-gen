import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		Arrays.sort(h);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n - k + 1; i++) {
			ans = Math.min(ans, h[i + k - 1] - h[i]);
		}
		System.out.println(ans);
	}
}
