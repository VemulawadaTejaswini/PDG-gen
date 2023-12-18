import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var s = sc.next();
		sc.close();

		var rc = 0;
		for (var i = 0; i < n; i++) {
			if (s.substring(i, i + 1).equals("R")) {
				rc++;
			}
		}

		var count = 0;
		for (var i = 0; i < rc; i++) {
			if (s.substring(i, i + 1).equals("W")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
