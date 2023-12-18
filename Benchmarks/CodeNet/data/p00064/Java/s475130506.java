import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
		int c = 0;
		while (sc.hasNextInt()) {
			c += sc.nextInt();
		}
		System.out.println(c);
	}
}