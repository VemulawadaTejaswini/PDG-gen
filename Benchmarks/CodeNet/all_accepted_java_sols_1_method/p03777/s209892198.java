import java.util.Scanner;
 
public class Main{
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String a = sc.next();
  String b = sc.next();
  
 
  if ( a.equals("H") && b.equals("H")) 
   System.out.println("H");
  if ( a.equals("H") && b.equals("D")) 
   System.out.println("D");
  if ( a.equals("D") && b.equals("H"))
   System.out.println("D");
  if ( a.equals("D") && b.equals("D")) 
   System.out.println("H");
 
 }
 
}