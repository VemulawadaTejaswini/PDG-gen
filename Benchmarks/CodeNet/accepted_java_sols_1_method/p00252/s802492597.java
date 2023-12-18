import java.util.*;
public class Main{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String ans="Close";
       String s =sc.nextLine();
   if(s.equals("1 1 0")) ans="Open";
   else if(s.equals("0 0 1")) ans="Open";
	   System.out.println(ans);
   }
}