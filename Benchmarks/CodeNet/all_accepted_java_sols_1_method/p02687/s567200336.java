import java.util.*;
 
public class Main{
  
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
   String s=sc.next();
   if(s.charAt(s.length()-2)=='B')System.out.println("ARC");
   else System.out.println("ABC");
 }
}
