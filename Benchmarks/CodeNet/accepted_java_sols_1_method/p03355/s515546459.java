import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int K = Integer.parseInt(br.readLine());

		TreeSet<String> set = new TreeSet<>();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j <= str.length()) {
					set.add(str.substring(i, i + j));
				}
			}
		}
		List<String> list = new ArrayList<>(set);
		System.out.println(list.get(K - 1));
	}
}