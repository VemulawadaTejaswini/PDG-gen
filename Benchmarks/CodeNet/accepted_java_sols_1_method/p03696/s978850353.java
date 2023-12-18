import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringBuilder sb = new StringBuilder(s);
		br.close();

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c == '(') {
				while (cnt < 0) {
					sb.insert(0, '(');
					cnt++;
				}
				cnt++;
			} else {
				cnt--;
			}
		}

		while (cnt < 0) {
			sb.insert(0, '(');
			cnt++;
		}
		while (cnt > 0) {
			sb.append(')');
			cnt--;
		}
		System.out.println(sb.toString());
	}
}
