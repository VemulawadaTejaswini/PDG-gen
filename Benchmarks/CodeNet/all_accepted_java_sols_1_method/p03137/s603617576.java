import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		String line = br.readLine();

		long N = Long.parseLong(line.split(" ")[0]);
		long M = Long.parseLong(line.split(" ")[1]);

		List<Long> xs = new ArrayList<Long>();
		line = br.readLine();
		for (String s : line.split(" ")) {
			xs.add(Long.valueOf(s));
		}
		Collections.sort(xs);

		List<Long> diffs = new ArrayList<Long>();
		for (int i=1; i< xs.size(); i++) {
			diffs.add(xs.get(i) - xs.get(i-1));
		}
		Collections.sort(diffs);

		long result = 0;
		for (int i=0; i < diffs.size()- (N-1); i++){
			result += diffs.get(i);
		}

		System.out.println(result);
	}
}