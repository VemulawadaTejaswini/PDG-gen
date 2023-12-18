
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);

	 
		String worString = inScanner.next();
		char d = worString.charAt(0);
		if (Character.isUpperCase(d)) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
		
	}
}