import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var k = sc.nextInt();
		var s = sc.next();
		sc.close();

		var result = s.length() <= k ? s : s.substring(0, k) + "...";
		System.out.println(result);
	}
}