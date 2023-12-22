import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();		//n人
	        
	        int[] xarray = new int[n];
	        int[] yarray = new int[n];
	        
	        for(int i=0; i<n; i++) {
	        	xarray[i] = scan.nextInt();		//n人
	        }
	        
	        for(int i=0; i<n; i++) {
	        	yarray[i] = scan.nextInt();		//n人
	        }
	        
	        
	        double p1 = 0;
	        double p2 = 0;
	        double p3 = 0; 
	        double pinf = Math.abs(xarray[0] - yarray[0]); 

	        for(int i=0; i<n; i++) {
	        	int xy = Math.abs(xarray[i] - yarray[i]);
		        
	        	p1 += xy;
	        	p2 += xy * xy;
	        	p3 += xy * xy * xy;
	        	
	            if(pinf < xy) {
	                pinf = xy;
	            }
	        }
	        System.out.println(p1);
	        System.out.println(Math.sqrt(p2));
	        System.out.println(Math.cbrt(p3));
	        System.out.println(pinf);
	}
}
