import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();
      	String t_head = t.substring(0,t.length()-1);
      
      if (s.equals(t_head)){
         System.out.println("Yes");
      }else {
         System.out.println("No");
        }
	
      	
        scan.close();
    }
}
