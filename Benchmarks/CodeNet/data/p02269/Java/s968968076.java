import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");

			if (str[0].equals("insert")) {
				sb.append(str[1]);
				sb.append(" ");
			} else {
				if (sb.indexOf(str[1]) != -1) {
					ans.append("yes");
					ans.append("\n");
				} else {
					ans.append("no");
					ans.append("\n");
				}
			}
		}

		System.out.print(ans);
	}

}