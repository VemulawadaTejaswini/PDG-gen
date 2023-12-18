import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	// 席
	static String[] seat = new String[17];
	static String emptySeatString = "_";

	public static void main(String[] args) throws IOException {

		// 初期値設定
		Arrays.fill(seat, emptySeatString);

		// グループ
		Group[] group;
		// インプット
		List<Integer> input = new ArrayList<Integer>();
		int maxInputNum = 0;

		// String a = "5\r\n6\r\n7\r\n11";
		// InputStream bais = new ByteArrayInputStream(a.getBytes("utf-8"));
		// // 意味的にはSystem.in = bais;
		//
		// BufferedReader br = new BufferedReader(new InputStreamReader(bais));

		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));

		// 最終行まで読み込む
		String num = "";
		while ((num = br.readLine()) != null) {
			input.add(Integer.parseInt(num));
			maxInputNum = Math.max(maxInputNum, Integer.parseInt(num));
		}

		group = new Group[maxInputNum + 1];

		int i = 0;
		group[maxInputNum] = new Group();

		// ラストのグループが食べ終わるまでループ処理実行
		while (!group[maxInputNum].eatFlug) {

			// 時間を経過させる ←ここのループ工夫すれば 回数を減らせる
			for (int n = 0; n < i; n++) {
				if (maxInputNum < n) {
					break;
				}

				// 食べてるグループ
				if (!group[n].waitFlug && !group[n].eatFlug) {

					// 経過時間カウント
					group[n].pastTime += 5;

					// 食べ終わったか確認
					if (group[n].pastTime >= group[n].eatTime) {

						// 食べ終わっているグループがいる場合、退店処理を実施
						byeStore(String.valueOf(n));
						group[n].eatFlug = true;

						// 待っているグループが入れるか確認(待ってるグループは自分より絶対後)
						for (int m = n + 1; m < i; m++) {

							if (maxInputNum < m) {
								break;
							}

							if (group[m].waitFlug) {
								// 待っていたら入店処理
								// 入店処理で待ちの1グループ目が入れなかったら(enterStoreの戻り値falseなら)後続組もまつ
								if (enterStore(m, group[m].peopleCnt)) {

									group[m].waitTime += (group[n].eatTime + 5)
											- group[n].pastTime;
									group[m].pastTime += group[n].pastTime
											- group[n].eatTime;

									group[m].waitFlug = false;
								} else {
									break;
								}

							}
						}

					}
				}

				// 待ってるグループは待ち時間をカウント
				else if (group[n].waitFlug) {
					group[n].waitTime += 5;
				}

			}

			// 新規来店グループがいるかどうか確認
			if ((maxInputNum) >= i) {
				group[i] = new Group();

				// グループ情報の設定
				setGroupInfo(group, i);

				// 前のグループが待ってなければ入店処理
				if (i != 0) {
					if (!group[i - 1].waitFlug) {
						if (!enterStore(i, group[i].peopleCnt)) {
							group[i].waitFlug = true;
						}
					} else {
						group[i].waitFlug = true;
					}
				} else {
					if (!enterStore(i, group[i].peopleCnt)) {
						group[i].waitFlug = true;
					}
				}

			}

			// テスト出力
			// for (String abc : seat) {
			// System.out.print(abc);
			// }
			// System.out.println();

			// 次グループが来る時間までカウント
			i++;
		}

		// てすと出力
//		for (int p = 0; p < group.length; p++) {
//			System.out.println("グループ番号：" + p + "　人数" + group[p].peopleCnt
//					+ "　食事時間" + group[p].eatTime);
//
//		}

		// 待ち時間を出力する
		for (int inputNum : input) {
			System.out.println(group[inputNum].waitTime);
		}
	}

	// 入店処理
	// 席が空いているかどうかチェック
	// 空いていれば入店し、trueを返す
	// 空いていなければ待ちフラグを付与し、falseを返す
	static boolean enterStore(int i, int currentPeopleCnt) {
		int emptySeat = 0;
		boolean okFlug = false;

		for (int n = 0; n < seat.length; n++) {

			if (okFlug) {
				break;
			}

			if ("_".equals(seat[n])) {

				emptySeat++;

				for (int m = n + 1; m < currentPeopleCnt + n; m++) {

					// 次の席がない場合はブレイク
					if (m == seat.length) {
						n = m;
						break;
					}

					if (!"_".equals(seat[m])) {
						n = m;
						emptySeat = 0;
						break;
					} else {
						emptySeat++;
					}

					if (currentPeopleCnt == emptySeat) {
						for (int l = m; l > m - currentPeopleCnt; l--) {
							seat[l] = String.valueOf(i);
						}
						okFlug = true;
						break;
					}

				}
			}

		}

		return okFlug;
	}

	static void byeStore(String n) {

		for (int i = 0; i < seat.length; i++) {
			if (seat[i].equals(n)) {
				seat[i] = emptySeatString;
			}
		}
	}

	// グループ情報の設定
	static void setGroupInfo(Group[] group, int i) {
		group[i].eatTime = 17 * (i % 2) + 3 * (i % 3) + 19;

		if (i % 5 == 1) {
			group[i].peopleCnt = 5;
		} else {
			group[i].peopleCnt = 2;
		}
	}

	static class Group {
		// 人数
		int peopleCnt = 0;
		// 食事時間
		int eatTime = 0;

		// 経過時間
		int pastTime = 0;
		// 食べ終わりフラグ(true：食べ終わった、false：食べ終わってない)
		boolean eatFlug = false;

		// 待ち時間
		int waitTime = 0;
		// 待ちフラグ(true：待ってる、false：待ってない)
		boolean waitFlug = false;

		// 退店フラグ(true：帰った、false：帰ってない)
		boolean byeFlug = false;
	}

}