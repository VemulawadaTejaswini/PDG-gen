import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int in = scanner.nextInt(2);
		
		int t = in;
		int c = 0;
		while (t > 0) {
			if ((t & 1) == 1) {
				c++;
			}
			t = t >> 1;
		}
		
		System.out.println(c);

	}

}
