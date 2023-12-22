import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int d=sc.nextInt();
    int ans=b/d-a/d;
    if(a%d==0)
      ans++;
    System.out.println(ans);
  }
}