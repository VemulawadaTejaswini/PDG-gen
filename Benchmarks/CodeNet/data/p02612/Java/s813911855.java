import java.io.*;
import java.util.*;
class program
{
  public static void main(String ar[])throws Exception
  {
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(r.readLine());
    int p=n%1000;
    if(p==0)
      System.out.println(p);
    else
      System.out.println((1000-p));
  }
}
