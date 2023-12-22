import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		var result = 0L;
		var max = 0;
		for (var i = 0; i < n; i++) {
			max = Math.max(max, a[i]);
			result += max - a[i];
		}

		System.out.println(result);
	}
}
