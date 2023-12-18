import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    
    
    String ss=s.next();
    ArrayList<String>l=new ArrayList<String>();
    l.add("SAT");
    l.add("FRI");
    l.add("THU");
    l.add("WED");
          l.add("TUE");
    l.add("MON");
    l.add("SUN");
    
    System.out.println(l.indexOf(ss)+1);
  }
}