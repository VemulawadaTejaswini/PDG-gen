import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.next();
		sc.close();

		var sum = 0;
		for (var i = 0; i < n.length(); i++) {
			sum += Integer.parseInt(n.substring(i, i + 1));
		}

		var result = sum % 9 == 0 ? "Yes" : "No";
		System.out.println(result);
	}
}
