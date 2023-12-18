package arrays;

import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    int n  = sc.nextInt();
    
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;

    
    for(int i = 0; i < n; i++)
    {
      String str = sc.nextLine();
      if(str.equals("A"))
          b++;
      if(str.equals("W"))
    		  {
          c++;
    		  }
      if(str.equals("T"))
          d++;
      if(str.equals("R"))
          e++;
    }
    System.out.println("AC x "+b);
    System.out.println("WA x "+c);
    System.out.println("TLE x "+d);
    System.out.println("RE x "+e);
  }
}                          
