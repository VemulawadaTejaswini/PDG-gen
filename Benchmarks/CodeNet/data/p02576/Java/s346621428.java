import java.util.*;
class sun
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),x=sc.nextInt(),t=sc.nextInt();
    int a=0;
    if(n%x==0) a=n/x;
    else a=n/x+1;
    System.out.println(a*t);
  }
}
