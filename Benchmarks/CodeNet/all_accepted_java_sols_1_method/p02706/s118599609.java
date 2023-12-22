import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    for(int i=0;i<m;i++)
    {
      int x = in.nextInt();
      n-=x;
    }
    if(n>=0)
    System.out.println(n);
    else
      System.out.println("-1");
  }
}
    
