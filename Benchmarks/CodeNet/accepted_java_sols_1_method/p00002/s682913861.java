import java.util.Scanner;
import java.lang.Math;

public class Main
{
  public static void main(String[] args)
  {
  Scanner in=new Scanner(System.in);
  
  while(in.hasNext())
  {
    int a , b , len=1, l;
    
    a=in.nextInt();
    b=in.nextInt();
   
    l=a+b;
    
    if(l==0) System.out.println(len);
    
    else
    {
       len=(int) Math.log10(l)+1;
    
    System.out.println(len);
    }
    
   
  }
      }
    }
 