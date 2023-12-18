import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		long count = IntStream.rangeClosed(numbers[0], numbers[1]).boxed().filter(s -> numbers[2] % s == 0).count();
		System.out.println(count);
	}
}
