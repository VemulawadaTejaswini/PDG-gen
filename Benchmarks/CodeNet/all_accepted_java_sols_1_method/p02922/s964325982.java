import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		
      	int a = scan.nextInt();
      	int b = scan.nextInt();

      if(b == 1){
       	System.out.println(0);
		return; 
      }
      
      if(a >= b){
        
        System.out.println(1);
		return;
      }
      
      a = a - 1;
      b = b - 1;
      
       double rlt2 = Math.ceil((double)b / a);

            	System.out.println((int)rlt2);
    }
}
