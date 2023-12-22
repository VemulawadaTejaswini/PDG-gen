import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    if(a>=0 && b>=0 && a<=4500 && b<=4500)
    {
      System.out.println(2*b-a);
    }
  }
}