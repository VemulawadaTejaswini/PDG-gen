import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long N = scan.nextLong();

			long goukei = 0;
			for(long i = 1;i<=N;i++) {
				long s = N/i;

				goukei +=i*s*(s+1)/2;

			}

			System.out.println(goukei);





		}
	}


}
