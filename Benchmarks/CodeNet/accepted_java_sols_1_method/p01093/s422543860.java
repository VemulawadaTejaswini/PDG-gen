import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Selection of Participants of an Experiment
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			List<Integer> list = new ArrayList<>(n);

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) list.add(parseInt(st.nextToken()));

			Collections.sort(list);

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n - 1; i++) {
				min = Math.min(min, list.get(i + 1) - list.get(i));
				if (min == 0) break;
			}

			System.out.println(min);

		} //end while
	} //end main
}