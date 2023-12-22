import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int N;
    Scanner in=new Scanner(System.in);
    N=in.nextInt();
    int i;
    i=N%10;
    if(i==3)
      System.out.println("bon");
    else if(i==2 ||i==4 ||i==5 ||i==7 ||i==9)
      System.out.println("hon");
    else 
      System.out.println("pon");
  }
}
    
