
// 2020.6.28
// https://atcoder.jp/contests/intro-heuristics
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// ----------
		// 入力
		// ----------

		Scanner sc = new Scanner(System.in);
		int span = Integer.parseInt(sc.next()); // 何日間のスケジューリングをするか
		int minus[] = new int[26]; // 26種類のコンテストの飽きやすさ
		for (int i = 0; i < 26; i++) {
			minus[i] = Integer.parseInt(sc.next());
		}
		int plus[][] = new int[span][26]; // 26種類のコンテストの満足感
		for (int d = 0; d < span; d++) {
			for (int i = 0; i < 26; i++) {
				plus[d][i] = Integer.parseInt(sc.next());
			}
		}
		int input[] = new int[span]; // 開催したコンテスト
		for (int d = 0; d < span; d++) {
			input[d] = Integer.parseInt(sc.next());
		}

		// ----------
		// 変数初期化
		// ----------

		// 各コンテストが最終開催日から何日経過しているか
		int last[] = new int[26];
		for (int i = 0; i < 26; i++) {
			last[i] = 0;
		}

		// ユーザ満足度
		int result = 0;

		// ----------
		// d日目のコンテスト終了時の満足度を計算して出力
		// ----------

		for (int d = 0; d < span; d++) {
			
			// lastの更新
			for (int i = 0; i < 26; i++) {
				if (i == input[d] - 1) {
					last[i] = 0;
				} else {
					last[i]++;
				}
				//System.out.println("last[" + i + "] = " + last[i]);
			}

			// 開催による満足度アップ
			result += plus[d][input[d] - 1];
			
			// 日数経過による満足度ダウン
			for (int i = 0; i < 26; i++) {
				result -= minus[i] * last[i];
				//System.out.println(minus[i] * last[i]);
			}
			System.out.println(result);
		}

	}
}
