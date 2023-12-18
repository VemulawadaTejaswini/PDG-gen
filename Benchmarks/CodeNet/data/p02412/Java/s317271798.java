

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Map<Integer, List<Integer>>> list = new ArrayList<>();
		int mapKey = 0;

		while (true) {
			Map<Integer, List<Integer>> combination = new HashMap<>();
			try {
				String[] condition = br.readLine().split("\\s");
				int n = Integer.parseInt(condition[0]);
				int x = Integer.parseInt(condition[1]);

				if (n == 0 && x == 0) {
					break;
				}
				
				for (int i = 1; i <= n - 2; i++) {
					for (int j = i + 1; j <= n - 1; j++) {
						for (int k = j + 1; k <= n; k++) {
							if ((x == (i + j + k))) {
								combination.put(mapKey, Arrays.asList(i, j, k));
								mapKey++;
							}
						}

					}

				}
				list.add(combination);

			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}
		list.stream().forEach(map -> {
			System.out.println(map.size());
		});

	}

}

