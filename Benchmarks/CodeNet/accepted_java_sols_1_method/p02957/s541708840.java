import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		
		if (a % 2 != b % 2) {
			System.out.println("IMPOSSIBLE");
		} else {
			System.out.println((a + b) / 2);
		}
	}
}