import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String s[] = br.readLine().split("");
		List<String> strS = new ArrayList<>();
		List<String> strA = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			strS.add(s[i]);
			strA.add(s[i]);
		}

		List<String> set = new ArrayList<>();
		Collections.addAll(set, "-1");

		while (true) {
			boolean flag = false;
			for (int i = 0; i < strS.size() - 1; i++) {
				if (strS.get(i).equals("(") && strS.get(i + 1).equals(")")) {
					strS.set(i, "-1");
					strS.set(i + 1, "-1");
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
			strS.removeAll(set);
		}

		int left = 0;
		int right = 0;
		for (int i = 0; i < strS.size(); i++) {
			if (strS.get(i).equals("(")) {
				left++;
			} else {
				right++;
			}
		}

		for (int i = 0; i < right; i++) {
			System.out.print("(");
		}

		for (int i = 0; i < strA.size(); i++) {
			System.out.print(strA.get(i));
		}

		for (int i = 0; i < left; i++) {
			System.out.print(")");
		}
		System.out.println();
	}
}