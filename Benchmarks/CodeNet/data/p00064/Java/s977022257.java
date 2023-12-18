import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int sum = 0;

		while ((line = br.readLine()) != null) {
			// 行の開始・終端の判定しない
			line = " " + line + " ";
			char c;
			for (int i = 0; i < line.length(); i++) {
				c = line.charAt(i);
				if (c >= '0' && c <= '9') {
					int sta, end;
					sta = i;
					for (int j = sta; j < line.length(); j++) {
						i = j;
						c = line.charAt(j);
						if (c < '0' || c > '9') {
							break;
						}
					}
					end = i;
					// 負数の判定
					if (line.charAt(sta - 1) == '-')
						continue;
					// 小数点の判定
					if (line.charAt(end) == '.') {
						c = line.charAt(i + 1);
						if (c >= '0' && c <= '9') {
							for (int j = end + 1; j < line.length(); j++) {
								i = j;
								c = line.charAt(j);
								if (c < '0' || c > '9') {
									break;
								}
							}
							continue;
						}
					}
					sum += Integer.parseInt(line.substring(sta, end));
				}
			}
		}
		System.out.println(sum);
	}
}