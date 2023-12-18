import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		long ans = line[0];

		for (int i = 1; i < len; i++) {
			ans *= line[i];
		}
		if (ans > 1000000000000000000L) {
			ans = -1L;
		}
		System.out.println(ans);

	}


}
