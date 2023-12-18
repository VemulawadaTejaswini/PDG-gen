import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		stdin.readLine();
		int[] elems = Arrays.stream(stdin.readLine().split(" "))
				.mapToInt(Integer::parseInt)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.mapToInt(Integer::new)
				.toArray();
		int alice = IntStream.range(0, elems.length)
				.filter(i -> i % 2 == 0)
				.map(i -> elems[i])
				.sum();
		int bob = IntStream.range(0, elems.length)
				.filter(i -> i % 2 == 1)
				.map(i -> elems[i])
				.sum();
		System.out.println(alice - bob);
	}

}