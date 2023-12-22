import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[] p = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			p[i] = i;
		}
		while (m-- > 0) {
			String s = br.readLine();
			int a = Integer.parseInt(s.split(",")[0]);
			int b = Integer.parseInt(s.split(",")[1]);
			int t = p[a];
			p[a] = p[b];
			p[b] = t;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(p[i]);
		}
	}
}