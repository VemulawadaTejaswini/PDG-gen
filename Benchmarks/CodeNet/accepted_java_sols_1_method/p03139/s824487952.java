import java.util.Scanner;
import java.math.*;
 class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int max=(int)Math.min(a,b);
    int min=0;
    if((a+b)>n)
      	min=(a+b)-n;
   	else
      	min=0;
    System.out.println(max+" "+min);
  }
}