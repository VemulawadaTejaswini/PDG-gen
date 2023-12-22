import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long n 	= Long.parseLong(scanner.nextLine());
		long ans = 0;

		for(long j = 1; j < n + 1; j++) {

			if(j % 3 != 0 && j % 5 != 0) {

				ans += j;

			}

		}

		System.out.println(ans);



	}
}