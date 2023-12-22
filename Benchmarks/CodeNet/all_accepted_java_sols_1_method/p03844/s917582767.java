import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        String op = scan.next();
        int b = scan.nextInt();
        
        int cnt = 0;
        
        if( op.charAt(0)== '+' )System.out.println(a+b);
        else if( op.charAt(0)== '-' )System.out.println(a-b);
        
	  }
}