import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// クソコード

		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int k = Integer.parseInt(br.readLine());

		ArrayList<String> list = new ArrayList<String>();
		list.add(s);
		boolean issorted = false;

		for (int i = s.length() - 1; 0 <= i; i--) {
			for (int j = (k <= s.length() - i ? k : s.length() - i); 0 < j; j--) {
				String sb = s.substring(i, i + j);
				if (list.contains(sb))
					continue;
				if (k <= list.size()) {
					if (!issorted) {
						Collections.sort(list);
						issorted = true;
					}
					if (sb.compareTo(list.get(k - 1)) < 0) {
						list.remove(k - 1);
						list.add(sb);
						Collections.sort(list);
					}
				} else {
					list.add(sb);
				}
			}
		}

		Collections.sort(list);

		System.out.println(list.get(k - 1));

	}

}