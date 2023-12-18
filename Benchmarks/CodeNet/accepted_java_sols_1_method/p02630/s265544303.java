import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		int q = Integer.parseInt(br.readLine());
		int[] b = new int[q];
		int[] c = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			b[i] = Integer.parseInt(sa[0]);
			c[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		long[] cnt = new long[100001];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			cnt[a[i]]++;
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			long d = (c[i] - b[i]) * cnt[b[i]];
			sum += d;
			pw.println(sum);

			cnt[c[i]] += cnt[b[i]];
			cnt[b[i]] = 0;
		}
		pw.flush();
	}
}
