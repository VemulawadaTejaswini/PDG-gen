import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int ans = 0;
		int min = n + 1;
		for (int i = 0; i < n; i++) {
			if (p[i] < min) {
				ans++;
				min = p[i];
			}
		}
		System.out.println(ans);
	}
}
