import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	private static Object GRAY = new Object();
	private static Object BROWN = new Object();
	private static Object GREEN = new Object();
	private static Object SKYBLUE = new Object();
	private static Object BLUE = new Object();
	private static Object YELLOW = new Object();
	private static Object ORANGE = new Object();
	private static Object RED = new Object();
	private static List<Object> RATES_DEFAULT = Arrays.asList(GRAY, BROWN, GREEN, SKYBLUE, BLUE, YELLOW, ORANGE, RED);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();

		Function<Integer, Object> classifier = i -> {
					if (i < 400) return GRAY;
					if (i < 800) return BROWN;
					if (i < 1200) return GREEN;
					if (i < 1600) return SKYBLUE;
					if (i < 2000) return BLUE;
					if (i < 2400) return YELLOW;
					if (i < 2800) return ORANGE;
					if (i < 3200) return RED;
					return new Object();
				};
		List<Object> rates = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).map(classifier).distinct().collect(Collectors.toList());

		int max = rates.size();
		rates.retainAll(RATES_DEFAULT);
		int min = Math.max(rates.size(), 1);
		System.out.println(min + " " + max);
	}
}
