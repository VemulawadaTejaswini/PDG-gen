
import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		
		for(int i = 1;i <= n;i++) {
			
			x = i;
			
			
			if(x % 3 == 0) {
				System.out.print(" " + x);
				
			}else {
					
			
			while(true) {
				if(x % 10 == 3) {
					System.out.print(" " + i);
					break;
					
				}
				
				if(x < 10) {
					break;
					
				}else {
					x = x / 10;
					
				}
			}
		}
		}
		
		
		System.out.println("");
		
				
	}
}

