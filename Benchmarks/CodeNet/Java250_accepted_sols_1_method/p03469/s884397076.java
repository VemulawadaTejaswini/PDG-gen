import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		System.out.println("2018" + s.substring(4));
	}
}
