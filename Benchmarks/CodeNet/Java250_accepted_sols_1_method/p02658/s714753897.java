import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main{
  public static void main(String agrs[])
  {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = in.nextInt();
    long[] arr = new long[n];
    long max = (long) Math.pow(10,18);
    boolean zero = false;
    long counter = 1;
    for(int i = 0; i < n; i++)
    {
      arr[i] = in.nextLong();
      if(arr[i] == 0)
      {
        zero = true;
      }
    }
    if(zero)
    {
      out.println(0);
    }
    else
    {
      for(int i = 0; i < n; i++)
      {
        if(arr[i] > max / counter)
        {
          zero = true;
          break;
        }
        counter *= arr[i];
      }
      if(zero)
      {
        out.println(-1);
      }
      else
      {
        out.println(counter);
      }
    }
    out.close();
  }
}