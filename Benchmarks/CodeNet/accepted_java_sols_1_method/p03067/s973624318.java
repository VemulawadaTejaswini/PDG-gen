import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A<B) {
			if (A<C && C<B) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		else {
			if (A>C && C>B) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
		
	}
}	
