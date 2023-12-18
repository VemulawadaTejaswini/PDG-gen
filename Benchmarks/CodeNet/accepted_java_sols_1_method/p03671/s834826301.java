import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int maxValue = 0;
        
        int i;
        
        if( a > maxValue )maxValue = a;
        if( b > maxValue )maxValue = b;
        if( c > maxValue )maxValue = c;
            
        System.out.println( a+b+c - maxValue );
	  }
}