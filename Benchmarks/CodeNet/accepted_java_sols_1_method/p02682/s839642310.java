import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextInt();
		var b = sc.nextInt();
		var c = sc.nextInt();
		var k = sc.nextInt();
		sc.close();

		int max = Math.min(a, k) - Math.max(0, Math.min(c, k - a - b));
		System.out.println(max);
	}
}