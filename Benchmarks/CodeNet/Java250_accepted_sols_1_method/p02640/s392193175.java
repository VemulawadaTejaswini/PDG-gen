import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int m=0;
    int flag=0;
    if(y<=x*2||y<=x*4)
    {
      for(int i=1;i<=x;i++)
      {
        int j=i*2;
        m=i*4;
        int h=y-j;
        int h1=y-m;
        if((h1%2==0&&h1/2==x-i)||(h%4==0&&h/4==x-i))
        {
          flag=1;
          break;
        }
      }
    }
    if(flag==1)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
} 
