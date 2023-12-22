import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=sc.nextLong();
    long d=sc.nextLong();
    long ans1=Math.max(a,b)*Math.max(c,d);
    long ans2=Math.min(a,b)*Math.max(c,d);
    long ans3=Math.max(a,b)*Math.min(c,d);
    long ans4=Math.min(a,b)*Math.min(c,d);
    long ans=Math.max(ans1,Math.max(ans2,
    Math.max(ans3,ans4)));
    System.out.println(ans);
  }
}
