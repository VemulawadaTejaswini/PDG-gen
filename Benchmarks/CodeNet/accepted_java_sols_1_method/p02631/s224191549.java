import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
   
    int arr[]=new int[x];
     int tot=sc.nextInt();
    arr[0]=tot;
    for(int i=1;i<x;i++)
    {
      arr[i]=sc.nextInt();
      tot=tot^arr[i];
    }
    for(int i=0;i<x;i++)
    {
       System.out.print((arr[i]^tot)+" ");
    }
  }
}