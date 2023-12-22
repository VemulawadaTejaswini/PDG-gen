import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var t = sc.next();
		sc.close();

		var sb = new StringBuilder();
		for (var i = 0; i < t.length(); i++) {
			var s = t.substring(i, i + 1);
			if (s.equals("?")) {
				s = "D";
			}
			sb.append(s);
		}
		System.out.println(sb.toString());
	}
}
