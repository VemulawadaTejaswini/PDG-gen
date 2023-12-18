
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if(a < c && c < b) {
			System.out.println("Yes");
			return;
		}
		
		if(b < c && c < a) {
			System.out.println("Yes");
			return;
		}
		
		System.out.println("No");
		return;
		
	}

}
