import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int t = scan.nextInt();
		
		if (x>t) {
			System.out.println(x-t);
		} else {
			System.out.println(0);
		}
	}
}
