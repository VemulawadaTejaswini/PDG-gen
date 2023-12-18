import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[] ans = new int[1000000];
	static int i;

	// 素数か判別する：素数ならtrue
	//
	public static boolean check(int num) {
		for (int i = 2; i <= num-1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		for (i = 0; i < 1000000; i++) { // 入力を読み込む
			int count = 0;
			String str = br.readLine();
			num = Integer.parseInt(str);
			if (num == 0) {
				break;
			} // 読み込みの処理ここまで

			for (int n = num + 1; n <= 2 * num; n++) {
				if (check(n)) {
					count++;
				}
			}
			ans[i] = count;
		} // iのループ

		for (int j = 0; j < i; j++) {
			System.out.println(ans[j]);
		}
	}
}
