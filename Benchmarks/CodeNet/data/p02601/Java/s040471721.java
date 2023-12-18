import java.util.*;
 
public class Main{
  	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      	int c = Integer.parseInt(sc.next());
      	int k = Integer.parseInt(sc.next());
      	for(int cnt = 0;cnt < k;cnt++){
         	if(a >= b){
            	b *= 2;
            }else if(b >= c){
            	c *= 2;
            }
        }
      	if(a < b && b < c){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}