import java.util.*;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int legs=sc.nextInt();
    double val1=((4*n)-legs)/2;
    double ans1=Math.floor(val1);
    double val2=(legs-(2*n))/2;
    double ans2=Math.floor(val2);
    
    if(val1>=0 && val1-ans1==0)
      System.out.println("Yes");
    else if(val2>=0 && val2-ans2==0)
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
}
