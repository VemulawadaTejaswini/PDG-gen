import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt(),t=sc.nextInt(),s=sc.nextInt();
    if((d/s)>t) System.out.println("No");
    else System.out.println("Yes");
  }
}
