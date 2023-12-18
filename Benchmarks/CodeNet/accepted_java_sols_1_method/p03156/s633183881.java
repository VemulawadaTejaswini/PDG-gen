import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String... args) throws IOException {

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		line = br.readLine();
		int a = Integer.parseInt(line.split(" ")[0]);
		int b = Integer.parseInt(line.split(" ")[1]);
		line = br.readLine();
		List<Integer> is = new ArrayList<Integer>();
		for (String str : Arrays.asList(line.split(" "))) {
			is.add(Integer.parseInt(str));
		}
		br.close();

		// A点以下の数
		int group1 = 0;
		int group2 = 0;
		int group3 = 0;
		for (int i : is) {
			if (i <= a) {
				group1++;
			} else if (i >= b + 1) {
				group3++;
			} else {
				group2++;
			}
		}

		System.out.println(Math.min(Math.min(group1, group2), group3));

	}
}