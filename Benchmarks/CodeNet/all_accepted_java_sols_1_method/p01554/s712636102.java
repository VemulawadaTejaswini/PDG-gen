/**
 * Kagisys
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());
		Set<String> ids = new HashSet<String>();
		boolean lock = true;

		for (int i = 0; i < n; i++) {
			ids.add(br.readLine());
		}

		int m = parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String id = br.readLine();
			if (ids.contains(id)) {
				if (lock) {
					sb.append("Opened by " + id + "\n");
					lock = false;
				} else {
					sb.append("Closed by " + id + "\n");
					lock = true;
				}
			} else {
				sb.append("Unknown " + id + "\n");
			}
		}
		System.out.print(sb.toString());
	} //end main
}