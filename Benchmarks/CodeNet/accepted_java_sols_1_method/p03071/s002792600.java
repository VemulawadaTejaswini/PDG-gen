import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	int n = a + b;
      	int m = a + a - 1;
      	int o = b + b - 1;
      	int ans = n;
      	if(n < m){
        	ans = m;
			if(m < o){
            	ans = o;
            }
        }
      	else {
        	if(n < o){
            	ans = o;
            }
        }
      	System.out.print(ans);
    
    }
 
}