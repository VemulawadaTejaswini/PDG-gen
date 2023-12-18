import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();

		Arrays.sort(line);

		long sum = line[len - 1];

		if (len > 2) {
			int items = (len - 1) / 2;
			int lastItems = (len - 1) % 2;
			for (int i = 1; i <= items; i++) {
				if (i == items) {
					if (lastItems == 0) {
						sum += line[len - 1 - i];
					} else {
						sum += line[len - 1 - i] * 2;
					}
				}else {
					sum += line[len - 1 - i] * 2;
				}
			}
		}

		System.out.println(sum);
	}

}