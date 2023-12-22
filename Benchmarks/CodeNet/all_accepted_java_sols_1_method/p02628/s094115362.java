import java.util.*;
class Main
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int k=sc.nextInt();
    int arr[]=new int[x];
    for(int i=0;i<x;i++)
      arr[i]=sc.nextInt();
    Arrays.sort(arr);
    int sum=0;
    for(int i=0;i<k;i++)
      sum+=arr[i];
    System.out.print(sum);
  }
}