import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n-1;i++)
      arr[Sc.nextInt()-1]++;
    for(int i=0;i<n;i++)
      System.out.println(arr[i]);
  }
}
