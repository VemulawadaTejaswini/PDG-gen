import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			if(i > 9) {
				System.out.println("No");
				break;
			}
			
			if(n % i == 0) {
				
				int a = n / i;
				
				if(a >= 1 && a <= 9) {
					System.out.println("Yes");
					break;
				}
			}
		}
	}
}