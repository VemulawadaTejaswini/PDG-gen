import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner (System.in);
      	int n = scan.nextInt();	
      	int ans = 0;
        if(n >= 100000 ){
        	ans += 90000;
        }
      	if(n >= 10000 && n < 100000){
        	ans += (n - 10000) + 1;
        }
      	if(n >= 1000){
        	ans += 900;
        }
      	if(n >= 100 && n < 1000){
        	ans += (n - 100) + 1;
        }
      	if(n >= 10){
        	ans += 9;
        }
      	if (n < 10){
        	ans += n;
        }
      System.out.print(ans);
    }
}
