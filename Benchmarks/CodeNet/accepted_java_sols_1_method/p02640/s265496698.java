import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    int ll=n*2;
    int ul=4*n;
    if(p%2!=0)
      System.out.println("No");
    else if(p>=ll && p<=ul)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}