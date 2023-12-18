import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		String[] strs = scan.nextLine().split(" ");

		long distinctCount = Arrays.stream(strs).mapToInt(str -> Integer.parseInt(str)).distinct().count();

		System.out.println(count == distinctCount ? "YES" : "NO");
		scan.close();
	}
}