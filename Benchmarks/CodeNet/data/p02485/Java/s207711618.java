import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    while(true)
    {
      int num=sc.nextInt();
      int sum=0;
      if(num==0)
      {
        break;
      }
      int q=num/10;
      int r=num%10;
      while(num!=0)
      {
        sum+=r;
        num=q;
        q=num/10;r=num%10;
      }
      System.out.printf("%d",sum);
    }
  }
}