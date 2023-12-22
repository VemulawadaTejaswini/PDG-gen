import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int tmp = in[0] - 1;
		int s = in[1] - tmp;
		int e = in[1] + tmp;
		List<String> list = new ArrayList<>();
		IntStream.rangeClosed(s, e).forEach(c -> list.add(String.valueOf(c)));
		String coordinate = String.join(" ", list);
		
		System.out.println(coordinate);
	}
}
