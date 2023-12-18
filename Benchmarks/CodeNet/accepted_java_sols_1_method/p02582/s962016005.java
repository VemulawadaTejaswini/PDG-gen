import java.util.*;
import java.io.*;
import java.lang.*;



class Main
{
  public static void main(String[] args) {

  Scanner s=new Scanner(System.in);
  String a;
  a=s.next();
  int n=a.length();

  if(a.charAt(0)=='R' && a.charAt(1)=='R' && a.charAt(2)=='R')
  {
    System.out.print(3);
  }
  else if(a.charAt(0)=='R' && a.charAt(1)=='R' && a.charAt(2)=='S')
  {
    System.out.print(2);
  }
  else if(a.charAt(0)=='R' && a.charAt(1)=='S' && a.charAt(2)=='R')
  {
    System.out.print(1);
  }
  else if(a.charAt(0)=='S' && a.charAt(1)=='R' && a.charAt(2)=='R')
  {
    System.out.print(2);
  }
  else if(a.charAt(0)=='R' && a.charAt(1)=='S' && a.charAt(2)=='S')
  {
    System.out.print(1);
  }
  else if(a.charAt(0)=='S' && a.charAt(1)=='R' && a.charAt(2)=='S')
  {
    System.out.print(1);
  }
  else if(a.charAt(0)=='S' && a.charAt(1)=='S' && a.charAt(2)=='R')
  {
    System.out.print(1);
  }
  else
  {
    System.out.print(0);
  }












  }
}
