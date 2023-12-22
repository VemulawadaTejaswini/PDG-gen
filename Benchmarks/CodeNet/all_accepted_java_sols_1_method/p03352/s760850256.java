import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int ans = 1;

		for (int i = 1; i <= 1000; i++) {
			for (int j = 2; j < 1000; j++) {
				int anstemp = (int) Math.pow(i, j);
				if (x < anstemp) {
					break;
				}
				if (ans < anstemp) {
					ans = anstemp;
				}
			}
		}

		System.out.println(ans);

	}

}
