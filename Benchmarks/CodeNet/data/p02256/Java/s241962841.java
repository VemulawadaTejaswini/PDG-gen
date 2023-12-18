
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt();
		if(b > a) {
			int c = a;
			a = b;
			b = c;
		}


		while(a % b != 0) {
			int c = a;
			a = b;
			b = c % b;
		}
		System.out.println(b);

	}

}

