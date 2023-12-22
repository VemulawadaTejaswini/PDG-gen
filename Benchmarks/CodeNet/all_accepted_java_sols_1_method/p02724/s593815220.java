
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = Integer.parseInt(sc.next());

		int ure = 0;

		while(X >= 500) {
			ure += (X / 500)*1000;
			X %= 500;

		}

		while(X >= 5) {
			ure += (X / 5)*5;
			X %= 5;

		}



		System.out.println(ure);

	}
}