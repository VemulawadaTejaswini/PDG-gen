import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] o = scanner.next().toCharArray(), e = scanner.next().toCharArray();
			StringBuilder sb = new StringBuilder();
			IntStream.range(0, e.length).forEach(i -> sb.append(o[i]).append(e[i]));
			IntStream.range(0, o.length - e.length).forEach(i -> sb.append(o[o.length - 1 - i]));
			System.out.println(sb.toString());
		}
	}
}
