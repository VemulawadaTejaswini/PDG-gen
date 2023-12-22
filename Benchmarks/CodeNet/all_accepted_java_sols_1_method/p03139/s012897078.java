import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
          
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int max, min;
        
        int cnt;
        
        if( a == 0 || b == 0 ){
          max = 0;
          min = 0;
        }
        
        else if( a + b <= n ){
          if(a>b){
            max = b;
          }
          else{
            max = a;
          }
          min = 0;
        }
        else{
          if(a>b){
            max = b;
          }
          else{
            max = a;
          }
          min = (a+b)-n;
        }
            
        System.out.println(max + " " + min);
	  }
}