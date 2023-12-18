import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		var m = 1000L;
		var index = 0;
		while (index < n - 1) {
			var v1 = a[index];
			var v2 = a[index];
			var index2 = -1;
			for (var i = index + 1; i < n; i++) {
				if (v2 <= a[i]) {
					v2 = a[i];
					index2 = i;
				} else if (v2 > v1 && v2 > a[i]) {
					break;
				} else if (v1 > a[i]) {
					v1 = a[i];
					v2 = a[i];
				}
			}
			if (index2 == -1) {
				break;
			}

			m += (m / v1) * (v2 - v1);
			index = index2;
		}
		System.out.println(m);
	}
}
