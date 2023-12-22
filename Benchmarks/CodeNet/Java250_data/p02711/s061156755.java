import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=0;
    while(n>0)
    {
      int d=n%10;
      if(d==7){
        k=1;
        System.out.println("Yes");
        break;
      }
      else
        n/=10;
    }
    if(k==0)
      System.out.println("No");
  }
}
