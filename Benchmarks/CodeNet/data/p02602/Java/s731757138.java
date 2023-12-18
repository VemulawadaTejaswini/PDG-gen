import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = k; i < n; i++) {
			if (a[i - k] < a[i]) {
				pw.println("Yes");
			} else {
				pw.println("No");
			}
		}
		pw.flush();
	}
}
