import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner stdin = new Scanner(System.in)) {
			int n = Integer.parseInt(stdin.next());

			if (n < 3 || n > 10000) {
				throw new RuntimeException("Range:3 to 10000");
			}

			StringBuilder sb = new StringBuilder();
			IntStream.rangeClosed(1, n).forEach(i -> {
				if (i % 3 == 0) {
					sb.append(' ').append(i);
				} else if (i % 10 == 3) {
					sb.append(' ').append(i);
				} else if (i / 10 == 3) {
					sb.append(' ').append(i);
				}
			});
			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}