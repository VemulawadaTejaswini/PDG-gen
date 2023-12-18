import java.util.Scanner;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> dict = new HashSet<>();
		StringBuilder out = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			String cmd = (String)sc.next();
			if (cmd.equals("insert")) {
				String str = (String)sc.next();
				dict.add(str);
			}
			if (cmd.equals("find")) {
				String str = (String)sc.next();
				out.append(dict.contains(str) ? "yes" : "no");
				out.append("\n");
			}
		}
		System.out.print(out);
	}
}
