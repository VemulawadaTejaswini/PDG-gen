import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String revStr, str = in.readLine();
		int a, b, num = Integer.parseInt(in.readLine());
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < num; i++) {
			String[] order = in.readLine().split(" ");
			a = Integer.parseInt(order[1]);
			b = Integer.parseInt(order[2]);
			if (order[0].equals("print")) {
				System.out.println(str.substring(a, b + 1));
			} else if (order[0].equals("reverse")) {
				StringBuffer revSb = new StringBuffer(str.substring(a, b + 1));
				revStr = revSb.reverse().toString();
				str = sb.replace(a, b + 1, revStr).toString();
			} else if (order[0].equals("replace")) {
				str = sb.replace(a, b + 1, order[3]).toString();
			}
		}
	}
}