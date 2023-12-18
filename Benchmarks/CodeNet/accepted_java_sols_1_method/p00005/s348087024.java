
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String in = scan.nextLine();
			list.add(in);
		}
		scan.close();

		for (String str : list) {
			String[] strs = str.split(" ");
			long a = Long.valueOf(strs[0]);
			long b = Long.valueOf(strs[1]);

			long na = a;
			long nb = b;

			ArrayList<Long> listA = new ArrayList<Long>();
			ArrayList<Long> listB = new ArrayList<Long>();

			//最大公約数用の変数と最小公倍数用の変数を用意
			long s = 1;
			long t = 1;

			//入力値の2つを素因数分解
			for (long i = 2; na > 1 || nb > 1; i += 2) {
				while (na % i == 0 && nb % i == 0) {
					//aとbの両方で割り切れる場合
					//最大公約数用の変数にiをかける
					s *= i;
					//aとbの作業用変数を両方ともiで割る
					na /= i;
					nb /= i;
				}

				//片方の数だけ割り切れる数を保存
				while (na % i == 0) {
					//割り切れた場合は、割った数を保存
					listA.add(i);
					//現在値を割った後の値で更新
					na /= i;
				}
				//こちらも同様
				while (nb % i == 0) {
					listB.add(i);
					nb /= i;
				}

				if (i == 2) {
					//初期値は2だが、以降偶数で割り切れることはないため、
					//ここで1引いて、以後は2刻みの奇数でのみ確認
					i -= 1;
				}
			}

			t = s;
			for (long l : listA) {
				t *= l;
			}
			for (long l : listB) {
				t *= l;
			}

			System.out.println(s + " " + t);
		}
	}
}

