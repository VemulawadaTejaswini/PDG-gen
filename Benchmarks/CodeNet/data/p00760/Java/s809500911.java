import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int y = nextInt();// 年
			int m = nextInt();// 月
			int d = nextInt();// 日

			int all = 195 * 999 + 333 * 5;// 1年1月1日生まれの人の日数
			int days = (y - 1) * 195 + (m - 1) * 19 + (d - 1);// 1年1月1日から何日経った時に生まれたか
			days += Math.round(m / 2);// 大の月の20日目を足す
			days += Math.round((y - 1) / 3) * 5;
			if (y % 3 == 0) {
				// 3の倍数年だった時、小の月の分も足す
				days += Math.round((m - 1) / 2);// 大の月の20日目を足す
			}

			System.out.println(all - days);
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}