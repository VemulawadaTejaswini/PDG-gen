import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int arr[]=new int[2];
    for(int i=0;i<2;i++)
    {
      arr[i]=in.nextInt();
    }
    Arrays.sort(arr);
    int mid=0,i=1;
    while(mid<=arr.length-1)
    {
      if(arr[mid]!=i)
      {
        System.out.println(i);
        System.exit(0);
      }
      mid++;
      i++;
    }
    System.out.println("3");
  }
}