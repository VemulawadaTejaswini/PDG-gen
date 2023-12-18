import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		sc.close();

		var sum = 0;
		for (var a = 1; a <= n; a++) {
			var count = n / a;
			if (n % a == 0) {
				count--;
			}
			sum += count;
		}
		System.out.println(sum);
	}
}
