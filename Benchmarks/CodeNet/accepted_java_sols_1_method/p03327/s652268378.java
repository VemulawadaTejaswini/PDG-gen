import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n > 0 && n < 1000) {
			System.out.println("ABC");
		}
		if(n > 999 && n < 1999) {
			System.out.println("ABD");
		}
	}
}