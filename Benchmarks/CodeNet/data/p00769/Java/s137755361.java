import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int N = sc.nextInt();
		while (N-- > 0) {
			String input = sc.next();
			System.out.println(dfs(input));
		}
	}

	int dfs(String seg) {
		if (Character.isDigit(seg.charAt(0))) {
			return Integer.valueOf(seg) / 2 + 1;
		}
		int left = 0;
		int start = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < seg.length(); i++) {
			if (seg.charAt(i) == '[') {
				left++;
			}
			if (seg.charAt(i) == ']') {
				left--;
			}
			if (left == 0) {
				list.add(dfs(seg.substring(start + 1, i)));
				start = i + 1;
			}
		}
		int sum = 0;
		Collections.sort(list);
		for (int i = 0; i < list.size() / 2 + 1; i++) {
			sum += list.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}