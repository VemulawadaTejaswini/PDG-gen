import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
      int a=0;
      double s=0;
    Scanner sc = new Scanner(System.in);
    double n=sc.nextDouble();
    double temp=n;
    while(temp>0)
    {
        a++;
        temp=temp/10;
    }
    temp=n;
    for(int i=0;i<a;i++)
    {
        s=s+(temp%10);
        temp=temp/10;
    }
    if(s%9==0)
    System.out.println("Yes");
    else
    System.out.println("No");
    
    
    
    
  }}