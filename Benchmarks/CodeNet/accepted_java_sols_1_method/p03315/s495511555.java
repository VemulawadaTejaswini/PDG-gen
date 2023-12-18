import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		Map<String, Long> count = Arrays.stream(line.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(count.getOrDefault("+", 0L) -count.getOrDefault("-", 0L));
	}
}
