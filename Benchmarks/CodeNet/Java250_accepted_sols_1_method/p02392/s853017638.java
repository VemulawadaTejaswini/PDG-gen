import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int a,b,c;

		Scanner stdIn = new Scanner(System.in);

		a = Integer.parseInt(stdIn.next());
		b = Integer.parseInt(stdIn.next());
		c = Integer.parseInt(stdIn.next());

		if(c > b && c > a) {
			if(b > a) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
}