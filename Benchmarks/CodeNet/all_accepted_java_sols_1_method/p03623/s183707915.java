import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int x=input.nextInt();
    int a=input.nextInt();
    int b=input.nextInt();
    if(x>=1 && a>=1 && b>=1 && a<=1000 && b<=1000 && x<=1000 && a!=b)
    {
      int tempa=(int)Math.abs(x-a);
      int tempb=(int)Math.abs(x-b);
      if(tempa>tempb)
      {
        System.out.println("B");
      }else
      System.out.println("A");
    }
  }
}