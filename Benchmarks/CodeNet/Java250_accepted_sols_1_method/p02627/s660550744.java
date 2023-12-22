import java.util.*;
 
public class Main {
 
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
      
 	String a = scan.next();
	      if(a.charAt(0) > 96 && a.charAt(0) < 123) 
	        System.out.println('a');
	      if(a.charAt(0) > 64 && a.charAt(0) < 91)
	        System.out.println('A');
    }
}