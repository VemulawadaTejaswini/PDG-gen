import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String a = scan.next();
        String b = scan.next();
        String cnt;
        
        if( a.charAt(0) == 'H' && b.charAt(0) == 'D' )cnt = "D";
        else if( a.charAt(0) == 'D' && b.charAt(0) == 'H' )cnt = "D";
        else cnt = "H";
        
        System.out.println(cnt);
	  }
}