import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String args[]) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    double p= a*b;
    if (p%2==0)
    	System.out.println("Even");
    else
    	System.out.println("Odd");

    
  }
}