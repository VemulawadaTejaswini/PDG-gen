import java.io.*;

 public class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    long ans = 1;
    for(int i = 0; i < n;i++)
      ans *= s.nextLong();
    
    if(ans > 1000000000000000000L)
    System.out.println(-1);
    else
      System.out.println(ans);
  }
}