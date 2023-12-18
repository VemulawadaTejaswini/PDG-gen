import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    long sum=0;
    for(int i=0;i<s.length();i++)
    {
      sum+=Long.parseLong(String.valueOf(s.charAt(i)));
    }
    if(sum%9==0)
    System.out.println("Yes");
    else
    System.out.println("No");
  }
}