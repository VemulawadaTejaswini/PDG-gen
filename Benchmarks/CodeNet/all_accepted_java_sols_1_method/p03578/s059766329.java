import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = Integer.parseInt(sa[i]);
		}

		int m = Integer.parseInt(br.readLine());
		sa = br.readLine().split(" ");
		int[] t = new int[m];
		for (int i = 0; i < m; i++) {
			t[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.sort(d);
		Arrays.sort(t);
		int i = 0;
		int j = 0;
		while (i < m) {
			if (j == n || d[j] > t[i]) {
				System.out.println("NO");
				return;
			}
			if (d[j] == t[i]) {
				i++;
			}
			j++;
		}
		System.out.println("YES");
	}
}
