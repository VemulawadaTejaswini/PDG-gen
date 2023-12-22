import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> tmp = new ArrayList<>();

		while (scanner.hasNext()) {
			tmp.add(scanner.next());
		}
		String[] input = tmp.toArray(new String[tmp.size()]);
		Arrays.sort(input);
		System.out.println(Math.abs(minus(input[1], input[0]) + minus(input[2], input[1])));
	}

	private static int minus(String a, String b) {
		return Integer.parseInt(a) -  Integer.parseInt(b);
	}

}