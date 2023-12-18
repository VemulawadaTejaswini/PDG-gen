import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int n,x,t,k;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    x=sc.nextInt();
    t=sc.nextInt();
    k=n/x;
    if(n%x>0)
      k+=1;
    System.out.println(k*t);
  }
}