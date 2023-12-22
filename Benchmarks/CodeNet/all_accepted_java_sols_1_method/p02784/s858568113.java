import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int hp = scan.nextInt();
		int count = scan.nextInt();
		
		int sum = 0;
		for (int i=0; i<count; i++) {
			sum += scan.nextInt();
		}
		
		if (sum >= hp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}