 import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    			
    			long x = sc.nextLong();
     
    			for(int a = 0 ; a < 300 ; a++ ) {
    				for(int b = -300 ; b < 300 ; b++ ) {
    					
    					long p = (long)(Math.pow(a, 5) - Math.pow(b, 5));
    					
    					if ( x == p ) {
    						System.out.println(a + " " + b);
    						return;
    					}
    				}
    			}
    		
    	}
     
    }