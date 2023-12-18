import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int count = (int)IntStream.range(0, n - 2).filter(i -> s.substring(i, i + 3).equals("ABC")).count();
		System.out.println(count);
	}
}
