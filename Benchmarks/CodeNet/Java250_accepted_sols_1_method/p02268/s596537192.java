import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		String[] tmp = br.readLine().split(" ");
		List<Integer> S = new ArrayList<Integer>();
		S.add(Integer.parseInt(tmp[0]));
		for (int i = 1; i < tmp.length; i++) {
			if (!tmp[i].equals(tmp[i - 1]))
				S.add(Integer.parseInt(tmp[i]));
		}
		br.readLine();
		String[] T = br.readLine().split(" ");

		int cnt = 0;
		for (String s : T) {
			if (Collections.binarySearch(S, Integer.parseInt(s)) >= 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

		if (br != null) {
			br.close();
			br = null;
		}
	}
}