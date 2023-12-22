import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 int N = scan.nextInt();
		 int Y = scan.nextInt();
		 
		 int kai_10000 = -1;
		 int kai_5000 = -1;
		 int kai_1000 = -1;
		 
		 loop: for (int i = 0; i <= N; i++ ) {
			 for (int j = 0; j <= N - i; j++ ) {
				 if (10000 * i + 5000 * j + 1000 * (N - i - j) == Y) {
						 kai_10000 = i;
						 kai_5000 = j;
						 kai_1000 = N - i - j;
						 break loop;
				 }
			 }
		 }

		 
		 System.out.println(kai_10000 + " " + kai_5000 + " " + kai_1000);

	}
}
