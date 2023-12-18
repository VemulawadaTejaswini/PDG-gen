import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		TreeMap<String, ArrayList<Integer>> index = new TreeMap<String, ArrayList<Integer>>();
		String word, page;

		while ((line = br.readLine()) != null) {

			int delm = line.indexOf(' ');
			word = line.substring(0, delm);
			page = line.substring(delm + 1);

			if (!index.containsKey(word)) {
				index.put(word, new ArrayList<Integer>());
				index.get(word).add(Integer.valueOf(page));
			} else {
				index.get(word).add(Integer.valueOf(page));
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String k : index.keySet()) {
			sb.append(k + "\n");
			Integer[] pages = index.get(k).toArray(new Integer[] {});
			Arrays.sort(pages);
			for (int i = 0; i < pages.length; i++) {
				if (i != pages.length - 1) {
					sb.append(pages[i] + " ");
				} else {
					sb.append(pages[i] + "\n");
				}
			}
		}
		System.out.print(sb.toString());
	}
}