import java.util.*;
import java.io.*;
 class Abc
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String ns=sc.nextLine();
    int l=ns.length();
    char p=ns.charAt(l-1);
    if(p=='s')
    {
      ns=ns+"es";
      System.out.println(ns);
    }
      else if(p!='s')
      {
      ns=ns+'s';
      System.out.println(ns);
    }
  }
}