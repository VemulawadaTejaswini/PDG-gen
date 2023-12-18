import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String input = sc.next();
			if("-".equals(input)){
				break;
			}
			
			final int m = sc.nextInt();

			for (int i = 0; i < m; i++) {
				final int h = sc.nextInt();
				
				input = input.substring(h) + input.substring(0, h);
			}
			
			System.out.println(input);
		}
	}
}