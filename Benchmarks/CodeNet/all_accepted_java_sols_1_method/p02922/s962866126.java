
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int power = scan.nextInt();
		int kuti = scan.nextInt();

		System.out.println((int)Math.ceil((double)(kuti-1)/(double)(power-1)));
		scan.close();
	}

}
