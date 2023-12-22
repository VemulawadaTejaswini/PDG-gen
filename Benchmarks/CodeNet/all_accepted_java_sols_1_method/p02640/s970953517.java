import java.util.*;

public class Main {
	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			
			for(int k = 0; k<=x; k++) {
				int z = x-k;
				int total = k * 2 + z * 4;
				if(total == y) {
					System.out.println("Yes");
					return;
				}
				
			}
	        
	        
	        
 
	        System.out.println("No");
	}
}