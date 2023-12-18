import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var k = sc.nextInt();
		var sb = new StringBuilder();
		for (var i = 0; i < k; i++) {
			sb.append("ACL");
		}
		sc.close();
		System.out.printf(sb.toString());
	}
}
