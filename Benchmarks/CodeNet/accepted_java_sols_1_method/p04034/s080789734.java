import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		int value[] = new int[N];
		Arrays.fill(value, 1);

		boolean dp[] = new boolean[100100];
		dp[0] = true;

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]) - 1;
			int y = Integer.parseInt(str[1]) - 1;

			value[x]--;
			value[y]++;

			if (dp[x])
				dp[y] = true;
			if (value[x] == 0) {
				dp[x] = false;
			}
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			if (dp[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
