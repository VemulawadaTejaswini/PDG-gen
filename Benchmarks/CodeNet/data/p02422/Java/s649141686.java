import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		str.append(br.readLine());
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String[] cmd = br.readLine().split(" ");
			int a = Integer.parseInt(cmd[1]);
			int b = Integer.parseInt(cmd[2]);
			if (cmd[0].equals("print")) System.out.println(str.substring(a, b + 1));
			else if (cmd[0].equals("reverse")) {
				sb.append(str.substring(a, b + 1));
				sb.reverse();
				str.insert(a, sb);
				str.delete(b + 1, b + sb.length() + 1);
				sb.delete(0, sb.length());
			} else if (cmd[0].equals("replace")) {
				str.insert(a, cmd[3]);
				str.delete(b + 1, b + cmd[3].length() + 1);
			}
		}
	}
}