import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for (int i = 1; ++i <= n; ) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			
			for (; x % 10 == 3;) {
				x /= 10;
				if (x != 0) {
					System.out.print(" " + i);
					continue;
				}
			}
		}
		System.out.println();
	}
}

