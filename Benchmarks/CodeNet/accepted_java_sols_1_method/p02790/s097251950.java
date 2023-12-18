import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		IntStream.range(0, a).forEach(i -> sb1.append(String.valueOf(b)));
		IntStream.range(0, b).forEach(i -> sb2.append(String.valueOf(a)));

		System.out.println(sb1.toString().compareTo(sb2.toString()) > 0 ? sb2.toString() : sb1.toString());
		scan.close();
	}
}