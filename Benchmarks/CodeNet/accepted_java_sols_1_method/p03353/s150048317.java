import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 解説閲覧後

		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int k = Integer.parseInt(br.readLine());

		HashSet<String> set = new HashSet<String>();
		set.add(s);

		for (int i = s.length() - 1; 0 <= i; i--) {
			for (int j = (k <= s.length() - i ? k : s.length() - i); 0 < j; j--) {
				set.add(s.substring(i, i + j));
			}
		}

		ArrayList<String> list = new ArrayList<String>(set);
		Collections.sort(list);

		System.out.println(list.get(k - 1));

	}

}
