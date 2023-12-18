import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char cstack;
    
    for(int i = 0;i < s.length();i++){
      	cstack = s.charAt(i);
    	if(cstack != ',') System.out.print(cstack);
      	else System.out.print(" ");
    }
   	
  	System.out.println();

  }
}
