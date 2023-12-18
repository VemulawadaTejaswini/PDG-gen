package fromOtomori;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] s = new int[100][1000]; // point[演技][それぞれの審査員の点]
	static int[] n = new int[100]; // 演技ごとの審査員の人数
	static int[] ave = new int[100];
	static int section = 0;
	static int[] max = new int[100];
	static int[] min = new int[100];
	static int i = 0, j = 0;


	/**
	 * 入力をn,sのそれぞれの配列に格納するメソッド
	 */
	public static void inPoint() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (j < 1000) {
			j = 0;
			String str = br.readLine();
			n[i] = Integer.parseInt(str);

			if (n[i] == 0) {
				section = i;
				break;
			}

			while (j < n[i]) { // すべての審査員の点を配列に格納
				str = br.readLine();
				s[i][j] = Integer.parseInt(str);
				j++; // 次の審査員
			}

			i++; // 次の演技
		}

	}

	/**
	 * 最大値および最小値を探すメソッド
	 */
	public static void findMaxMin(int s[][]) {

		for(i = 0; i < 100; i++){
			max[i] = 0;
			min[i] = 1000;
		}

		for (i = 0; i < section; i++) { // i（演技）が0から末尾まで繰り返す
			for (j = 0; j < n[i]; j++) { // j（審査員）が1から末尾のひとつ手前まで繰り返す

				if (s[i][j] < min[i]){
					min[i] = s[i][j];
				}
				if(s[i][j] > max[i]){
					max[i] = s[i][j];
				}
			} // jについてのループ

		}
	}

	/**
	 * 演技のそれぞれの平均を求めるメソッド
	 */
	public static void average(int s[][]) {

		for (i = 0; i < section; i++) {
			for (j = 0; j < n[i]; j++) { // 1番目から末尾の1つ前まで
				ave[i] += s[i][j]; // 合計を求める
			}
			ave[i] = (ave[i] - max[i] - min[i]) / (n[i] - 2); // 審査員の数-2で割る
		}

	}

	public static void main(String[] args) throws IOException {

		inPoint();
		findMaxMin(s);
		average(s);

		for (i = 0; i < section; i++) {
			System.out.println(ave[i]);
		}

	}

}

