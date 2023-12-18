import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		do {
			c -= b;
			if(c <= 0) {
				System.out.println("Yes");
				return;
			}
			
			a -= d;
			if(a <= 0) {
				System.out.println("No");
				return;
			}
		}while(true);
	}
}