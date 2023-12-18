import java.io.*;
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int maxcount = 0;
    int count=0;
    int N = sc.nextInt();
    int arr[][] = new int[N][2];
    int maxarr[] = new int[N];
    for(int i=0; i<N; i++)
    {
      for(int j=0; j<2; j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i = 0; i < N ; i++)
    {
      if(arr[i][0]==arr[i][1])
      {
        count++;
        
      }
      
      maxcount = Math.max(maxcount,count);
      maxarr[i]=maxcount;
      if(i>0 && maxarr[i]==maxarr[i-1])
        break;
    }
    if(maxcount>=3)
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}
                       