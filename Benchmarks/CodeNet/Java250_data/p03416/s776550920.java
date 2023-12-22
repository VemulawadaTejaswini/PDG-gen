import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		// 計算
		int count = 0;
		String first;
		String last;
		for (int i = A; i <= B; i++) {
			String value = String.valueOf(i);
			if (value.length() % 2 == 0) {
				first = value.substring(0, value.length() / 2);
				last = value.substring(value.length() / 2);
			} else {
				first = value.substring(0, (value.length() + 1) / 2);
				last = value.substring(value.length() / 2);
			}
			StringBuffer lastBuf = new StringBuffer(last);
			if (first.equals(lastBuf.reverse().toString())) {
				count++;
			}
		}

		// 出力
		System.out.println(count);

		return;
	}


}
