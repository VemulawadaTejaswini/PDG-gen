import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String a = scan.next();
        String b = scan.next();
        String a_b = a + b;
        
        String cnt;
        
        int num = Integer.parseInt( a_b );
        
        int num_root = (int)Math.sqrt((double)num);
        
        //System.out.println(num_root);
        
        if( num_root * num_root == num )
          cnt = "Yes";
        else
          cnt = "No";
        
        System.out.println(cnt);
	  }
}