import java.io.*;
import java.util.*;
public class Main{

     public static void main(String []args){
    Scanner s=new Scanner(System.in);
      String a=s.next();
      String b=s.next();
      long aa=s.nextLong();
      long bb=s.nextLong();
      String c=s.next();
      if(c.equals(a))
      {aa--;
      System.out.println(aa+" "+bb);}
      else
      {bb--;
      System.out.println(aa+" "+bb);}
    
    
     }
}