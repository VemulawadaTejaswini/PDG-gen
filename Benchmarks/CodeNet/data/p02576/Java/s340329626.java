import java.util.*;
pubic class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),x=sc.nextInt(),t=sc.nextInt();
    int a=(int)Math.floor(n/x);
    System.out.println(a*t);
  }
}
