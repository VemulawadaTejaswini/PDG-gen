import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var b = IntStream.range(0, n - 1).map(i -> sc.nextInt()).toArray();
		sc.close();

		var result = b[0] + b[n - 2] + IntStream.range(0, n - 2).map(i -> Math.min(b[i], b[i + 1])).sum();
		System.out.println(result);
	}
}
