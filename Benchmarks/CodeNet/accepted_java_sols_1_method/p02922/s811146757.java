import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int taps = 1;
		int con = 0;
		while (taps < line[1]) {
			taps = taps + line[0] - 1;
			con++;
		}

		System.out.println(con);
	}
}
