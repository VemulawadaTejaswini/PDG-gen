import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String m=s.toUpperCase();
    if(s.equals(m))
      System.out.println("A");
    else
       System.out.println("a");
  }
}