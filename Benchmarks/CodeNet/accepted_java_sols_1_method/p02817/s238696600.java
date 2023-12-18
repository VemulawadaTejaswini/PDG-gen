import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final String a = scn.next();
			final String b = scn.next();
		
			System.out.println(b+a);
		}
	}
}