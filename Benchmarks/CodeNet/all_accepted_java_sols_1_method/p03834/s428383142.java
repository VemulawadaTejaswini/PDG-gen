import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
        
        String s        = scan.next();
        String after_s  = s.replace(",", " ");
            
        System.out.println(after_s);
	  }
}