import java.io.*;
import java.util.*;
class Main
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
    int K=sc.nextInt();
    int A=sc.nextInt();
    int B=sc.nextInt();
    int n=1;
    while(n<=(B/K))
    {
      if(A<=(K*n) && (K*n)<=B)
      {
        System.out.print("OK");
        return;
      }
      else
      n++;
    }
    System.out.print("NG");
  }
}