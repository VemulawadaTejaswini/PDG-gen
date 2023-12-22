
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		outside: for (int i = n;; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue outside;
				}
			}
			System.out.println(i);
			break;
		}
		
		
	}
}
