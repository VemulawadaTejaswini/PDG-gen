import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sstack;
    char cstack;
    
    for(int i = 0;i < 3;i++){
    	sstack=sc.next();
      	cstack = (char)((int)sstack.charAt(0) - 32);
      	System.out.print(cstack);
    }
    System.out.println();
  }
}
