import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String B = sc.next();
		if(B.equals("A")) {
			System.out.println('T');
		} else if(B.equals("T")) {
			System.out.println('A');
		} else if(B.equals("G")) {
			System.out.println('C');
		} else {
			System.out.println('G');
		}
	}

}
