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
    BigInteger num = new BigInteger("1");
    BigInteger max = new BigInteger("1000000000000000000");
    for(int i = 0; i < n; i++)
    {
        String temp = String.valueOf(in.nextLong());
		num = num.multiply(new BigInteger(temp));
    }
    if(num.compareTo(max) > 0)
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