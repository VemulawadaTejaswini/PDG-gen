import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    if(a>=1 && b>=1 && a<=10000 && b<=10000)
    {
      a=a*b;
      if(a%2==0)
      {
        System.out.println("Even");
      }else
      System.out.println("Odd");
    }
  }
}