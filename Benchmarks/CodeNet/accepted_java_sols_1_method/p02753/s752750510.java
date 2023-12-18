import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
     String str=sc.nextLine();
     String s1=str.substring(0);
      char c1=str.charAt(0);
      char c2=str.charAt(1);
      char c3= str.charAt(2);
     
      if(c1==c2 && c2==c3)
      System.out.println("No");
      else
      System.out.println("Yes");
      }
    
}