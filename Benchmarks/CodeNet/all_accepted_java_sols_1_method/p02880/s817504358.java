
import java.util.*;

public class Main {


	public static void main (String [] args) {
		
		
		int n;
		boolean sw = false;
		Scanner sc = new Scanner(System.in);
		
	 
		
		do {
			
			n = sc.nextInt(); 
			
		}while(!(n>=1 && n<=100));
	
		
		for(int i = 1;i<=9;i++) {
			
			for(int j = 1;j<=9;j++) {
				
				if(i*j == n) {
					sw = true;
				}
			}
			
		}
		
		if(sw == true) {
			
			System.out.println("Yes");
		}else {
			
			System.out.println("No");
		}
	
		
		
	}
}
		