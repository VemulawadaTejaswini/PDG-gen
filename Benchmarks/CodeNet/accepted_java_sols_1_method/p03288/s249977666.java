import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n < 1200) {
			System.out.println("ABC");
			return;
		} else if (1200 <= n && n < 2800) {
			System.out.println("ARC");
			return;
		} 
		System.out.println("AGC");
	}
}
