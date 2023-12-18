import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		var t = sc.next();
		sc.close();

		var result = Integer.MAX_VALUE;
		for (var i = 0; i < s.length() - t.length() + 1; i++) {
			var count = 0;
			for (var j = 0; j < t.length(); j++) {
				var s1 = s.substring(i + j, i + j + 1);
				var t1 = t.substring(j, j + 1);
				if (!s1.equals(t1)) {
					count++;
				}
			}
			result = Math.min(result, count);
		}

		System.out.println(result);
	}
}
