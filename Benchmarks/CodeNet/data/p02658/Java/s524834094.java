import java.util.*;
import java.io.*;
public class Main{
  public static void main(String agrs[])
  {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int n = in.nextInt();
    long num = 1;
    long max = (long) Math.pow(10,18);
    for(int i = 0; i < n; i++)
    {
		num *= in.nextLong();
    }
    if(num > max)
    {
      out.println(-1);
    }
    else
    {
      out.println(num);
    }
    out.close();
  }
}