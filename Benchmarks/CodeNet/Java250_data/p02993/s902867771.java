import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	boolean isGood = true;
      	if(s.charAt(0) == s.charAt(1)) isGood = false;
      	if(s.charAt(1) == s.charAt(2)) isGood = false;
      	if(s.charAt(2) == s.charAt(3)) isGood = false;
      	
      	if(isGood) System.out.println("Good");
      	else System.out.println("Bad");
    }
}