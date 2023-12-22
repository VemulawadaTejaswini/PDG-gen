
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int multiple = scan.nextInt();
		int minus = scan.nextInt();
		int gram = scan.nextInt();
		
		int ans = 0;
		for (int i = 0; i < 10; i++) {
			if (i == 0) {				
				ans = multiple * gram - minus;
			} else {
				ans = ans * multiple - minus;
			}
			System.out.println(ans);
		}
	}	
}