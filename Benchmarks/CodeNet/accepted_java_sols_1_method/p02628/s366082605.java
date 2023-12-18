import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var p = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		Arrays.sort(p);
		var sum = 0L;
		for (int i = 0; i < k; i++) {
			sum += p[i];
		}
		System.out.println(sum);
	}
}