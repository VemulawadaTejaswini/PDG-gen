import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int K=in.nextInt();
    int l=(int)Math.ceil((Math.log(N)/Math.log(K)));
if(l==0)
System.out.println("1");
else
System.out.println(l);
  }
}