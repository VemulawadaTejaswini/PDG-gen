import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] ABC = { scanner.next(), scanner.next(), scanner.next() };
		Arrays.sort(ABC, Comparator.reverseOrder());
		System.out.println(Integer.valueOf(ABC[0] + ABC[1]) + Integer.valueOf(ABC[2]));
		scanner.close();
	}
}