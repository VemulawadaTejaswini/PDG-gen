
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   long a=sc.nextInt();
    long b=sc.nextInt();
    long c=sc.nextInt();
    long d=sc.nextInt();
    long arr[]=new long[4];
    arr[0]=a*c;
    arr[1]=a*d;
    arr[2]=b*c;
    arr[3]=b*d;
    Arrays.sort(arr);
    System.out.println(arr[3]);
    
  }
}
