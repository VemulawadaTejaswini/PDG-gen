import java.util.Scanner;
import java.io.*;
 
class Main
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
	     int l = sc.nextInt();
	     String s ;
	     s = sc.nextLine();
	     if(s.length()<=l)
	     {
	       System.out.println(s);
	     }
	     else
	     {
	       s.substring(0,l);
	       s.concat("...");
	       System.out.println(s);
	     }
	     
    
  }
}