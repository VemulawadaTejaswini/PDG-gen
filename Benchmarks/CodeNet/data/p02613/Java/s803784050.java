import java.util.*;
import java.io.*;
public class Main{
 public static void main(String agrs[])
 {
   Scanner in = new Scanner(System.in);
   PrintWriter out = new PrintWriter(System.out);
   int n = Integer.parseInt(in.nextLine());
   int a = 0;
   int b = 0; 
   int c = 0;
   int d = 0;
   for(int i = 0; i < n; i++)
   {
     String temp = in.nextLine();
     if(temp.equals("AC"))
     {
      	a++; 
     }
     else if(temp.equals("WA"))
     {
      	b++; 
     }
     else if(temp.equals("TLE"))
     {
       c++;
     }
     else
     {
       d++;
     }
   }
   out.println("AC x " + a);
   out.println("WA x " + b);
	out.println("TLE x " + c);
	out.println("RE x " + d);
   out.close();
 }
}