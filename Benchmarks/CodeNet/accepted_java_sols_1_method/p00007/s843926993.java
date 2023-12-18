import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//外部入力取り込んだ借金をしている期間（週単位）
		int week = Integer.parseInt(in.readLine());
		//借金
		double debt = 100000;
		//利子
		double interest = 1.05;

		//借金の計算
		for (int i = 0; i < week; i++) {
			//一週間ごとに 借金に5% の利子を借金に加える
			debt = debt * interest;
			//借金の 1,000 円未満を切り上げ
			debt = Math.ceil(debt/1000);
			debt = debt * 1000;
		}
		//計算後の借金を整数として外部出力
		System.out.println((int)debt);
	}
}