import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len =Integer.parseInt(sc.nextLine());
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int ans=0;
		Arrays.sort(line);

		ans = line[len / 2] - line[len / 2 - 1];



		System.out.println(ans);
	}
}
