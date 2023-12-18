import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] strAry = br.readLine().split(" ");
			int n = Integer.parseInt(strAry[0]);
			int x = Integer.parseInt(strAry[1]);
			if (n == 0 && x == 0) break;
			int count = 0;
				for (int i = 1; i <= n; i ++) {
					for (int j = 1; j <= n; j++) {
						if (j < i) continue;
							for (int k = 1; k <= n; k++) {
								if (k < i || k < j) continue;
								if ((i + j + k) == x && i != j && j != k && k != i) {
									count++;
								}
							}
					}
				}
				System.out.println(count);
		}
	}
}