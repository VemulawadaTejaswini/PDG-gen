import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c = 0;
		
		b = scan.nextInt();
		c = scan.nextInt();
		a = scan.nextInt();

		String out = Arrays.asList(a, b, c).stream().map(i->String.valueOf(i)).collect(Collectors.joining(" "));
		System.out.println(out);
	}
}
