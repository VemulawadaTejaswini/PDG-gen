import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
  	int n=sc.nextInt();
    int d=sc.nextInt();
    int c=0;
    for(int i=0;i<n;i++)
    {
      long x1=sc.nextLong();
      long x2=sc.nextLong();
      x1=x1*x1;
      x2=x2*x2;
      long sum=x1+x2;
      double s=Math.sqrt(sum);
      if(s<=d)
        c++;
    }
    System.out.println(c);
}
}