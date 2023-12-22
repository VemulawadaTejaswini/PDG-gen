import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int s=in.nextInt();
    if(s>=n)
      System.out.print("unsafe");
    else
       System.out.print("safe");
  }
}