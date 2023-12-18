

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String[] num = br.readLine().split(" ");
			int n = Integer.parseInt(num[0]);
			int x = Integer.parseInt(num[1]);
			// ????????????
			if (n == 0 && x == 0)
				break;
			int cnt = 0;
			// 5 9
			for (int i = 1; i <= n - 2; i++) {
				for (int j = i + 1; j <= n - 1; j++) {
					for (int k = j + 1; k <= n; k++) {
						if ((i + j + k) == x)
							cnt++;
					}
				}
			}
			System.out.println(cnt);

		}

	}
}