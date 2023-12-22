import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int n = sc.nextInt();
    String s = sc.next();
    int stack;
    char chs[] = new char[s.length()];
    
    for(int i = 0; i < s.length();i++){
    	stack = (int)s.charAt(i) + n;
      	if(stack > 90) stack -=26;
      	chs[i] = (char)stack;
    }
    s = new String(chs);
    
    System.out.println(s);

  }
}
