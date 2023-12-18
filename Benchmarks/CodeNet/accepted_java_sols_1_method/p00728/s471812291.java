import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 平均点を代入する配列
		int[] average;
		average = new int[19];

		// 平均点を代入する要素の個数
		int numDataSet = 0;

		// データ読み込みループ
		for (int k = 0; k < 19; k++) {

			// 審判の数読み込み
			String str = br.readLine();
			int numJudges = Integer.parseInt(str);

			// 審判の数が０なら終了
			if (numJudges == 0)
				break;

			// 点数を代入する配列
			int[] score;
			score = new int[numJudges];

			// 点数代入、最大値・最小値は最初の２つに格納
			for (int i = 0; i < numJudges; i++) {
				String str1 = br.readLine();
				int point = Integer.parseInt(str1);
				score[i] = point;

				if (score[0] < score[i]) {
					int temp = score[0];
					score[0] = score[i];
					score[i] = temp;
				}

				if (score[1] > score[i]) {
					int temp = score[1];
					score[1] = score[i];
					score[i] = temp;
				}
			}

			// 最大値と最小値を除いた合計点÷（審判の数ー２）
			int sum = 0;
			for (int i = 2; i < numJudges; i++) {
				sum += score[i];
			}
			int ave = sum / (numJudges - 2);

			// 平均的配列に格納
			average[k] = ave;

			numDataSet++;

		}

		for (int l = 0; l < numDataSet; l++) {
			System.out.println(average[l]);

		}

	}

}

