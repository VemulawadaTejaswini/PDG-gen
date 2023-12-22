import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		sc.close();

		var result = true;
		for (var i = 0; i < s.length(); i++) {
			var si = s.substring(i, i + 1);
			if (i % 2 == 0 && si.equals("L") || i % 2 == 1 && si.equals("R")) {
				result = false;
				break;
			}
		}

		System.out.println(result ? "Yes" : "No");
	}
}
