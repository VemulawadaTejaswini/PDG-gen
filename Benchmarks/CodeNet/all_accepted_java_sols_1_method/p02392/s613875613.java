import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		c = Integer.parseInt(sc.next());

		if ((a < b) && (b < c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		
		sc.close();
	}
}