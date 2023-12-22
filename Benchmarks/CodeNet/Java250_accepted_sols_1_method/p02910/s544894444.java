
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String S = scan.next();
		
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'U' || S.charAt(i) == 'D') {
				continue;
			}
			
			if ((i + 1) % 2 == 1) {
				if (!(S.charAt(i) == 'R')) {
					System.out.println("No");
					count++;
					break;
				}
			}
			
			if ((i + 1) % 2 == 0) {
				if (!(S.charAt(i) == 'L')) {
					System.out.println("No");
					count++;
					break;
				}
			}
		}
		
		if (count == 0) {
			System.out.println("Yes");
		}
	}
}


