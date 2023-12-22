import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int X = scan.nextInt();
        int t = scan.nextInt();
        int cnt;
        
        if(X-t < 0)cnt = 0;
        else cnt = X-t;
            
        System.out.println(cnt);
	  }
}