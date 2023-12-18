import java.util.Scanner;
class abc
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
   int yen=1000,n,r;
    n=s.nextInt();
    r=n%yen;
    if(r==0)
      System.out.println("0");
    else
    {
     r=yen-r;
     System.oout.println(r);
    }
  }
}