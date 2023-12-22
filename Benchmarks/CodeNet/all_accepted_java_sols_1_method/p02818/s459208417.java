import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] temp = scanner.nextLine().split(" ");
		long a = Long.parseLong(temp[0]);
		long b = Long.parseLong(temp[1]);
		long k = Long.parseLong(temp[2]);

		if(k <= a) {

			System.out.println(a - k + " " + b);


		}else if(k > a && k - a < b) {

			System.out.println(0 + " " + (b - (k - a)));

		}else {

			System.out.println(0 + " " + 0);

		}



	}
}