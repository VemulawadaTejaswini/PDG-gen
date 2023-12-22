
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		long min = 0;

		if(Math.abs(line[1] - (line[0] % line[1])) > line[0] % line[1]) {
			min = line[0] % line[1];
		}else {
			min = Math.abs(line[1] - (line[0] % line[1]));
		}


		System.out.println(min);
	}
}
