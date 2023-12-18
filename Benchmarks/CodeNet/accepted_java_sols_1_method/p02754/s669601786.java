import java.io.*;
import java.util.*;
class Main
{
  public static void main(String ar[])
  {
	Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long a=sc.nextLong();
    long b=sc.nextLong();
    long ans=a*(n/(a+b))+(long)Math.min(n%(a+b),a);
    System.out.println(ans);
  }
}
  