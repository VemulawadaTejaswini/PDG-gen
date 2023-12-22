import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);
		String s = br.readLine();
		int[] cnt = new int[n + 1];
		for (int i = 1; i < n; i++) {
			cnt[i + 1] = cnt[i];
			if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
				cnt[i + 1]++;
			}
		}
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			int l = Integer.parseInt(sa[0]);
			int r = Integer.parseInt(sa[1]);
			System.out.println(cnt[r] - cnt[l]);
		}
		br.close();
	}
}
