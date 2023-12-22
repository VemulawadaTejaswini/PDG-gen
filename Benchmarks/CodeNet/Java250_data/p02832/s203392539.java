import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");

		int curNum = 1;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			if (a == curNum) {
				curNum++;
			} else {
				ans++;
			}
		}
		if (ans == n)
			System.out.println(-1);
		else
			System.out.println(ans);
	}
}