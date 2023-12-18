import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		String[][] num = {{".", ",", "!", "?", " "},
		{"a", "b", "c"},
		{"d", "e", "f"},
		{"g", "h", "i"},
		{"j", "k", "l"},
		{"m", "n", "o"},
		{"p", "q", "r", "s"},
		{"t", "u", "v"},
		{"w", "x", "y", "z"}};
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.delete(0, sb.length());
			String number = sc.next();
			int prev = 0, count = 0;
			for (int j = 0; j < number.length(); j++) {
				int k = Integer.parseInt(""+number.charAt(j));
				if (prev != 0 && k == prev) {
					count++;
				} else if (prev != 0 && k == 0) {
					sb.append(num[prev-1][count%num[prev-1].length]);
					count = 0;
					prev = 0;
				} else if (prev == 0 && k != 0) {
					prev = k;
				}
			}
			out.println(sb);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}