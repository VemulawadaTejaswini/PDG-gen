import java.util.*;
 
class Main {
	public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    
     System.out.println(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5) ? "Yes" : "No");
    
    }
  
}