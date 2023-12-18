import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int n = sc.nextInt();
    String stack;
    char cstack;
    List words = new ArrayList();
    boolean con = true;
    
    stack = sc.next();
    cstack = stack.charAt(stack.length()-1);
   	words.add(stack);
    
    for(int i = 1;i < n && con;i++){
      	stack = sc.next();
    	if(words.contains(stack) || stack.charAt(0) != cstack) con = false;
      	else{
        	cstack = stack.charAt(stack.length()-1);
   			words.add(stack);
        }
    }
    
    if(con) System.out.println("Yes");
    else System.out.println("No");

  }
}
