import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		Set<String> strSet = new HashSet<>();

		IntStream.range(0, n).forEach(i -> strSet.add(stdIn.next()));

		stdIn.close();

		System.out.println(strSet.size());
	}
}
