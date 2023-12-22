import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * メインクラス
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<String> items = new ArrayList<>();

		String line = null;
		List<Integer> as = new ArrayList<Integer>();
		while ((line = br.readLine()) != null) {
			items.add(line);
		}

		char[][] chars = new char[items.size()][N];

		for (int i = 0; i < items.size(); i++) {
			for (int j = 0; j < N; j++) {
				chars[i][j] = items.get(i).toCharArray()[j];
			}
		}

		int answer = 0;

		for (int i = 0; i < N; i++) {

			Map<Character, Integer> count = new HashMap<>();

			for (int j = 0; j < items.size(); j++) {

				if (count.containsKey(chars[j][i])) {
					count.put(chars[j][i], count.get(chars[j][i]) + 1);
				}else {
					count.put(chars[j][i], 1);
				}
			}
			int max = 0;
			for (Entry<Character, Integer> e : count.entrySet()) {
				if (max < e.getValue()) {
					max = e.getValue();
				}
			}

			answer += (items.size() - max);

		}

		System.out.println(answer);
		;

	}
}
