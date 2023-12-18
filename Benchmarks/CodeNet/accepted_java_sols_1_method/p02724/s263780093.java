import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int X;
    X=in.nextInt();
    int p,m,t,s;
   
      m=X/500;
     	p=X%500;
    t=p/5;
    s=m*1000+t*5;
    System.out.println(s);
  }
}
      
      
