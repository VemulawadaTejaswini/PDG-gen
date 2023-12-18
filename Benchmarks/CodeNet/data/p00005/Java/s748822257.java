import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner QQ=new Scanner(System.in);
    int A=QQ.nextInt();
    int B=QQ.nextInt();
    int lcm=1;
    int gcd=1;
    if(A<B)
    {
      int temp =A;
      A=B;
      B=temp;
    }
    int A1=A;
    int B1=B;
    for(int a=2;a<=A;a++)
    {
      if(A!=0 && B!=0){
        if(A%a==0 && B%a==0)
        {
          lcm=lcm*a;
          A=A/a;
          B=B/a;
        }
      }
    }
    if(A!=0 && B!=0)
    {
      lcm=lcm*A*B;
    }
    for(int b=2;b<=A1;b++)
    {
      if(A1!=0 && B1!=0)
      {
       if(A1%b==0 && B1%b==0)
        {
          gcd=gcd*b;
          A1=A1/b;
          B1=B1/b;
        }
      }
    }
    System.out.println(gcd);
    System.out.println(lcm);
  }
}
