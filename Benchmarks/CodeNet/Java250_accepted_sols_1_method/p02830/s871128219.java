import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String arr[]=new String[2];
    for(int i=0;i<2;i++)
    {
        arr[i]=in.next();
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[0].charAt(i)+""+arr[1].charAt(i));
    }
}
}
