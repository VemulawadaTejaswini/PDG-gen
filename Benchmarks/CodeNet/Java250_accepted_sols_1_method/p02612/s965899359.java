import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Main
{
  public static void main(String args[])
  {
    try
    {
    int n,rem=0,res=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    rem=n%1000;
    if(rem!=0)
    {
       res=1000-rem;
    }
    System.out.println(res);
    }
    catch(Exception e)
    {
      return ;
    }
  }
}
      
   
    