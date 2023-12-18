    import java.util.Scanner;
     
    public class Main {
    	public static void main (String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int N = sc.nextInt();
    		
    		int price = 0;
    		
    		for (int i = 0; i < 30; i++) {
    			
    			price += 4 * i;
    			
    			for (int j = 0; j < 20; j++) {
    				
    				if (N == price) {
    					System.out.println("Yes");
    					return;
    				}
    				
    				price += 7;
    			
    			}
    			
    			price = 0;
    			
    		}
    		
    		System.out.println("No");
    		
    	}
    }