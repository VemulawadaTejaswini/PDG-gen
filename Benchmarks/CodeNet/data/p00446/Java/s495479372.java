import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) {
				break;
			}

			TreeSet<Integer> taro, hana, turn;
			taro = new TreeSet<Integer>();
			hana = new TreeSet<Integer>();
			//配る
			for (int i = 0; i < n; i++) {
				taro.add(Integer.parseInt(br.readLine()));
			}
			for (int i = 1; i < 2 * n + 1; i++) {
				hana.add(i);
			}
			hana.removeAll(taro);
			//遊ぶ
			Integer deck = 0;
			turn = taro;
			while (true) {
				if ((deck = turn.ceiling(deck)) != null) {
					turn.remove(deck);
				} else {
					deck = 0;
				}
				if (turn.isEmpty()) break;
				turn = (turn == taro) ? hana : taro;
			}
			System.out.println(hana.size() + "\n" + taro.size());
		}
	}
}