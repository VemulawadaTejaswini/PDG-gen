import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		List<Integer> list = Arrays.asList(in[0] + in[1], in[0] - in[1], in[0] * in[1]);
		Optional<Integer> ans = list.stream().max(Comparator.naturalOrder());
		
		System.out.println(ans.get());
	}
}