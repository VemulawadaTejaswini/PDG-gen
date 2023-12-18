
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int x;
	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		x = in.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i*(i+1)/2 >= x) {
				System.out.println(i);
				return;
			}
		}
	}

}
