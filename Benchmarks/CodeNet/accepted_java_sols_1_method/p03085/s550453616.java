
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		if(in.equals("A")) {
			System.out.println("T");
		} else if(in.equals("T")) {
			System.out.println("A");
		} else if(in.equals("C")) {
			System.out.println("G");
		} else {
			System.out.println("C");
		}
	}

}
