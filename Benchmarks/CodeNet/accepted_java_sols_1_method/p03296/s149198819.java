import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			int cnt = 0;
			for (int i = 1; i < n; i++) {
				if (a[i - 1] == a[i]) {
					if (i == n - 1) {// 最後の一回
						a[i] = a[i - 1] + 1;
					} else { // それ以外は前後の数の和
						a[i] = (a[i - 1] + a[i + 1]) % 10000 + 1;
					}
					cnt++;
				}
			}
			System.out.println(cnt);

		} catch (IOException e) {
		}

	}

}
