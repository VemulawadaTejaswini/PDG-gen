import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		List<String> S = Arrays.asList(br.readLine().split(" "));
		br.readLine();
		String[] T = br.readLine().split(" ");

		int cnt = 0;
		for (String s : T) {
			if (Collections.binarySearch(S, s) != -1)
				cnt++;
		}
		System.out.println(cnt);

		if (br != null) {
			br.close();
			br = null;
		}
	}
}