import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		var count = 0;
		for (var i = 0; i < n; i++) {
			if ((i + 1) % 2 == 1 && a[i] % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
