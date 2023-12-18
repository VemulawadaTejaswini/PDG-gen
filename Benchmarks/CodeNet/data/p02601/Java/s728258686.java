import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextInt();
		var b = sc.nextInt();
		var c = sc.nextInt();
		var k = sc.nextInt();
		sc.close();

		var count1 = 0;
		while (a >= b) {
			b *= 2;
			count1++;
		}
		var count2 = 0;
		while (b >= c) {
			c *= 2;
			count2++;
		}
		System.out.println((count1 + count2) <= k ? "Yes" : "No");
	}
}
