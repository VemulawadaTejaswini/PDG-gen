import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashSet<String> left = new HashSet<>();
		HashSet<String> right = new HashSet<>();
		left.add("q");
		left.add("w");
		left.add("e");
		left.add("r");
		left.add("t");
		left.add("a");
		left.add("s");
		left.add("d");
		left.add("f");
		left.add("g");
		left.add("z");
		left.add("x");
		left.add("c");
		left.add("v");
		left.add("b");

		right.add("y");
		right.add("u");
		right.add("i");
		right.add("o");
		right.add("p");
		right.add("h");
		right.add("j");
		right.add("k");
		right.add("l");
		right.add("n");
		right.add("m");

		while (true) {
			String str[] = br.readLine().split("");

			if (str[0].equals("#"))
				break;

			boolean le = false;
			int ans = 0;

			if (left.contains(str[0])) {
				le = true;
			} else {
				le = false;
			}

			for (int i = 1; i < str.length; i++) {
				if (left.contains(str[i])) {
					if (!le) {
						ans++;
					}
					le = true;
				} else {
					if (le) {
						ans++;
					}
					le = false;
				}
			}
			System.out.println(ans);
		}
	}

}
