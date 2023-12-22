import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int dp[][] = new int[(1 << 21) + 1][21];
	static int dist[][] = new int[21][21];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1[] = br.readLine().split("");
		String s2[] = br.readLine().split("");

		int ans = 0;
		for (int i = 0; i < s1.length; i++) {
			if (!s1[i].equals(s2[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
