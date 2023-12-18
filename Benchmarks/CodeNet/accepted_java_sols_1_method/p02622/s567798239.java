import java.util.*;

public class Main {

	public static Scanner scan = new Scanner(System.in);
  	public static void main(String[] args) {
    
      String s = scan.next();
      String t = scan.next();
      
      int count = 0;
      
      for(int i=0; i<s.length(); i++) {
      
        if(s.charAt(i) != t.charAt(i))
          count++;
      
      }
      
      System.out.println(count);
      
    }
}