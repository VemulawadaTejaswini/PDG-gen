import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
    if(a>=1 && b>=1 && c>=1 && a<=10000 && b<=10000 && c<=10000)
    {
      int temp=a;
      a=a+b;
      b=b+c;
      c=c+temp;
      if(a<b && a<c)
      {
        System.out.println(a);
      }else
      if(b<c && b<a)
      {
        System.out.println(b);
      }else
      if(c<a && c<b)
      {
        System.out.println(c);
      }else
      if(a==b && b==c)
      {
        System.out.println(a);
      }
    }
  }
}