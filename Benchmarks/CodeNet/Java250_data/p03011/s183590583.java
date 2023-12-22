import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int p = scan.nextInt();
      	int q = scan.nextInt();
      	int r = scan.nextInt();
      	int ab = p + q;
      	int bc = q + r;
      	int ca = r + p;
      	if(p + q <= q + r){
        	if(p + q <= r + p) {
            	System.out.print(p + q);
            }
          	else {
            	System.out.print(r + p);
            }
        }
      	else if(q + r < p + q){
        	if(q + r <= r + p){
            	System.out.print(q + r);
            }
          	else {
            	System.out.print(r + p);
            }
        }
    
    }
 
 
}