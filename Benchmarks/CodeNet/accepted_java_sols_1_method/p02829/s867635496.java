
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = 0;
		
		for(int i = 1 ;i <= 3 ;i++) {
			if(i % 3 == a % 3 || i % 3 == b % 3) {
				continue;
			}
			else {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		
		
	}
}
