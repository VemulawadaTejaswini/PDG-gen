import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split("", 0)).mapToInt(Integer::parseInt).toArray();
		int let = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 2; i < line.length; i++) {
			let = line[i-2] * 100 + line[i-1] * 10 + line[i] * 1;
			if (min > Math.abs(let - 753)) {
				min = Math.abs(let - 753);
			}
		}
		System.out.println(min);
	}
}