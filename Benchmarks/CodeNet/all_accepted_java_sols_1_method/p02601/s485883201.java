import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sn = new Scanner(System.in);
    	int a = sn.nextInt();
      	int b = sn.nextInt();
        int c = sn.nextInt();
        int k = sn.nextInt();
      	while(true) {
        	if( (a < b) && (b < c) && (k == 0)) {
            	System.out.println("Yes");
                break;
            } else if(k == 0 ){
            	System.out.println("No");
                break;
            } else {
            	if( a >= b) {
                	b = b * 2;
                } else if( b >= c) {
                	c = c * 2;
                }
              	k--;
            }
        }
    
    }
}