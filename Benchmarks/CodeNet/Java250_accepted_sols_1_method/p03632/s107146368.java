import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int cnt;
        
        if( c >= b )cnt = 0;
        else{
          if( a >= c && b <= d )
            cnt = b-a;
          else if( d <= b && a >= c)
            cnt = d-a;
          else if( d <= b && a < c)
            cnt = d-c;
          else
            cnt = b-c;
        }
            
        if( cnt < 0 )cnt = 0;
        System.out.println(cnt);
	  }
}