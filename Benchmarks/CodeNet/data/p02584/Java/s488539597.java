
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long now = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());
		long dist = Long.parseLong(sc.next());

		if (now < 0) {
			now = -1 * now;
		}

		// 0をまたぐところまで到達しないパターン
		if (now - (k * dist) > 0) {
			System.out.println(now - (k * dist));
			return;
		}

		// ぴったり0にゴールするパターン
		if (now - (k * dist) == 0) {
			System.out.println(0);
			return;
		}

		// 以下、0をまたぐパターン

		// まず0の直前まで歩く
		k -= now / dist;
		now = now % dist;

		// 残りkが偶数なら、現在地がゴール
		if (k % 2 == 0) {
			System.out.println(now);
			return;
		}

		// 残りkが奇数なら、0を一度だけまたいだところがゴール
		System.out.println(-1 * (now - dist));

	}
}