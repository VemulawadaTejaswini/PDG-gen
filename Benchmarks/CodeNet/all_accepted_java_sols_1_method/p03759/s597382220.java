import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        String cnt;
        
        if( b-a == c-b )cnt = "YES";
        else cnt = "NO";
            
        System.out.println(cnt);
	  }
}