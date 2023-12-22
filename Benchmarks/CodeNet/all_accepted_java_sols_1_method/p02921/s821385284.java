import java.io.*;
import java.util.*;

class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    int ans=0;
    for(int i = 0;i<3;i++)
    {
      if(s.charAt(i)==t.charAt(i))
        ans++;
    }
    System.out.println(ans);
  }
}