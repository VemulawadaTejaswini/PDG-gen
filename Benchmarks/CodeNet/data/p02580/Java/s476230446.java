
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h_input = Integer.parseInt(sc.next());
		int w_input = Integer.parseInt(sc.next());
		long m = Long.parseLong(sc.next());

		int hCount[];
		hCount = new int[300001];
		int wCount[];
		wCount = new int[300001];
		ArrayList<String> inputList = new ArrayList<String>();

		// 箱位置情報をリストにしておこう
		for (int i = 0; i < m; i++) {
			int h = Integer.parseInt(sc.next());
			int w = Integer.parseInt(sc.next());
			inputList.add(h + "," + w);
		}

		// リストを読んで、行ごとに箱を数える
		for (String info : inputList) {
			hCount[Integer.valueOf(info.split(",")[0])]++;
		}

		// どの行に爆弾を置くかを決めよう
		int h_max_index = 1;
		int h_max = 0;
		for (int i = 1; i < 300001; i++) {
			if (h_max < hCount[i]) {
				h_max = hCount[i];
				h_max_index = i;
			}
		}
		// System.out.println("最も箱が多い行　" + h_max_index);
		// System.out.println("その行の箱の数　" + h_max);

		// リストを読んで、列ごとに箱を数える
		// （ただしさっき爆弾を置くことにした行にある箱はスルー）
		for (String info : inputList) {
			if (Integer.valueOf(info.split(",")[0]) != h_max_index) {
				wCount[Integer.valueOf(info.split(",")[1])]++;
			}
		}

		// どの列に爆弾を置くかを決めよう
		int w_max_index = 1;
		int w_max = 0;
		for (int i = 1; i < 300001; i++) {
			if (w_max < wCount[i]) {
				w_max = wCount[i];
				w_max_index = i;
			}
		}
		// System.out.println("最も箱が多い列　" + w_max_index);
		// System.out.println("その列の箱の数　" + w_max);

		// 結果出力
		System.out.println(h_max + w_max);
	}
}
