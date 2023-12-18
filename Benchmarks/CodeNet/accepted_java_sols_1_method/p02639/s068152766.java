import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = IntStream.range(0, 5).map(i -> sc.nextInt()).toArray();
		sc.close();

		int result = 0;
		for (var i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				result = i + 1;
				break;
			}
		}

		System.out.println(result);
	}
}
