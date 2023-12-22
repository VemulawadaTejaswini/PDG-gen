import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var l = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		Arrays.sort(l);
		var count = 0;
		for (var i = 0; i < n; i++) {
			for (var j = i + 1; j < n; j++) {
				for (var k = j + 1; k < n; k++) {
					if (l[i] < l[j] && l[j] < l[k] && l[i] + l[j] > l[k]) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
	}
}
