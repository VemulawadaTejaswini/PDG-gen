import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
    	Scanner sn = new Scanner(System.in);
     	Long x = Math.abs(sn.nextLong());
      	Long k = sn.nextLong();
      	Long d = sn.nextLong();
      	Long div = x / d; 
      	if( div == 0) {
          	if(k%2 == 0) {
        		System.out.println(x);	            
            } else {
                System.out.println(d - x);	
            }
        } else {
        	Long aux = k - div;
          	if(aux >= 0) {
            	if( (aux%2) == 0) {
            	System.out.println(Math.abs(x%d));	
            	} else {
            		System.out.println(Math.abs((x%d) - d));
            	}
            } else {
            	System.out.println(Math.abs(x) - (k * d));
            }
        }
    }
}