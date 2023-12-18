import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		sc.close();

		var a = new int[10001];
		for (var i = 1; i <= 100; i++) {
			for (var j = 1; j <= 100; j++) {
				for (var k = 1; k <= 100; k++) {
					var m = i * i + j * j + k * k + i * j + j * k + i * k;
					if (m <= 10000) {
						a[m]++;
					}
				}
			}
		}


		for (var i = 1; i <= n; i++) {
			System.out.println(a[i]);
		}
	}
}
