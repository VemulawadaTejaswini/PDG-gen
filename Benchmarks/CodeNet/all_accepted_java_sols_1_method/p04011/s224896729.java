import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int n = scan.nextInt();
        int k = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        int cnt = 0;
        
        if( n <= k )cnt = n * x;
        
        else{
         cnt = (x * k) + (n - k) * y; 
        }
         
        System.out.println(cnt);
	  }
}