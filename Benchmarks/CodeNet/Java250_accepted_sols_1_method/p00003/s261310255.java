import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String r = br.readLine();
		int n = Integer.valueOf(r);
		while (n > 0 && (r = br.readLine()) != null) {
			String[] s = r.split(" ");
			int[] e = { (int) Math.pow(Integer.valueOf(s[0]), 2),
					(int) Math.pow(Integer.valueOf(s[1]), 2),
					(int) Math.pow(Integer.valueOf(s[2]), 2) };
			Arrays.sort(e);
			System.out.println(((e[0] + e[1]) == e[2]) ? "YES" : "NO");
			n--;
		}
	}
}