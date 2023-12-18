import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] x = new int[n];
		int[] x2 = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
			x2[i] = x[i];
		}
		br.close();

		Arrays.sort(x2);
		int b1 = x2[n / 2 - 1];
		int b2 = x2[n / 2];
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			if (x[i] <= b1) {
				pw.println(b2);
			} else {
				pw.println(b1);
			}
		}
		pw.flush();
	}
}
