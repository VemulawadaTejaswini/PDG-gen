import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int q = Integer.parseInt(sa[2]);
		int[] c = new int[n];
		for (int i = 0; i < q; i++) {
			int a = Integer.parseInt(br.readLine()) - 1;
			c[a]++;
		}
		br.close();

		int ok = q - k;
		for (int i = 0; i < n; i++) {
			if (c[i] > ok) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
