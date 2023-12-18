import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String a = scan.next();
        String cnt;
        
        int sum = 0;
        
        for( int i = 0 ; i < a.length() ; i++ ){
          int s2integ = Integer.parseInt(a.substring(i,i+1));
          sum += s2integ;
        }
        
        int s_num = Integer.parseInt( a );
        
        if( s_num % sum == 0 )cnt = "Yes";
        else cnt = "No";
            
        System.out.println(cnt);
	  }
}