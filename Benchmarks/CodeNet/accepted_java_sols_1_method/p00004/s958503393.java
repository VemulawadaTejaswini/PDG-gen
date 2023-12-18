

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 入力として、最初にデータの個数を受け取り、以後は最初の入力個数分1行単位で三角形の各辺の長さを受け取る(" "区切り).
 * 最初のデータおよび各データは1データあたり1行のデータとなっている
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String in = scan.nextLine();
			list.add(in);
		}
		scan.close();

		//一行1データなので、リストの個数分ループ
		for (String str : list) {
			//" "区切りなので、" "で分割
			String[] split = str.split(" ");

			//入力値を数値に変換
			long x1 = Long.valueOf(split[0]);
			long y1 = Long.valueOf(split[1]);
			long z1 = Long.valueOf(split[2]);
			long x2 = Long.valueOf(split[3]);
			long y2 = Long.valueOf(split[4]);
			long z2 = Long.valueOf(split[5]);

			//yを消去
			//式1側の数値をy2で乗算する
			long x1d = x1 * y2;
			long y1d = y1 * y2;
			long z1d = z1 * y2;
			//式2側の数値をy1で乗算する
			long x2d = x2 * y1;
			long y2d = y2 * y1;
			long z2d = z2 * y1;

			//yの係数が揃ったので、式1から式2を引く
			x1d -= x2d;
			y1d -= y2d;
			z1d -= z2d;

			//zをxで割って、xの値を算出
			//なお、結果が少数の可能性もあるのでdouble型にキャストして算出
			double x = ((double) z1d) / x1d;

			//式1に上記のxを代入してyを算出
			double y = ((double) z1 - ((double) x1) * x) / y1;

			//小数点台4位が5以上か判定し、5以上の場合は小数点第4位に5を加算して桁上げ
			x = ((double) Math.round(x * 10000)) / 10000;
			y = ((double) Math.round(y * 10000)) / 10000;

			System.out.println(String.format("%.3f %.3f", x, y));
		}

	}
}

