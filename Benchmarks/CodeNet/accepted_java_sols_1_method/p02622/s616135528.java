import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var s = sc.next();
		var t = sc.next();
		sc.close();

		var count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!s.substring(i, i + 1).equals(t.substring(i, i + 1))) {
				count++;
			}
		}

		System.out.println(count);
	}
}
