import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		long result = Arrays.stream(h).filter(he -> he >= k).count();
		System.out.println(result);
	}
}
