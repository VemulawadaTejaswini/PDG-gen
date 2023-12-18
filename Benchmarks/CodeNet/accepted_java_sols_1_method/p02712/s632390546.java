import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();

		long total = 0;

		for(int i = 1; i <= n; i++) {

			if(i % 3 != 0 && i % 5 != 0 ) {
				total += i;
			}
			
		}

		System.out.println(total);
	}
}