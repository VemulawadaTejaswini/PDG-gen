import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	String ss[] = new String[3];
      	String sstack = sc.next();
      	char cstack = sstack.charAt(sstack.length()-1);
      	boolean sir = true;
      	
      	for(int i=0; i < 2 && sir;i++) {
          sstack = sc.next();
          if(sstack.charAt(0) != cstack) sir = false;
          cstack = sstack.charAt(sstack.length()-1);
        }
      	
      
      	if(sir) System.out.println("YES");
      	else System.out.println("NO");
	}
}
