
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String O = scan.nextLine();
		String E = scan.nextLine();
		for(int i = 0; i < O.length(); i++) {
			System.out.print(O.substring(i, i + 1));
			if(i < E.length()) {
				System.out.print(E.substring(i, i + 1));
			}
		}
		scan.close();

	}

}
