import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
	        int n = scan.nextInt();		//n人	
	        int[] point = new int[n];
	        
	        if(n == 0) {
	        	break;
	        }
	        
			double sum = 0;
	        
	        for(int i=0; i<n; i++) {
	        	
	        	point[i] = scan.nextInt();		
	            sum += point[i];
	            
	        }
	        
	        double m = sum / n;
			double a = 0;
	        
            for(int i=0; i<n; i++) {
	           	a += Math.pow(point[i] - m, 2) / n;
            }
            System.out.println(Math.sqrt(a));
		}
	}
}
