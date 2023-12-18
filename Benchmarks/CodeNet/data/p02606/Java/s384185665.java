import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt(),c=0;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
      if(arr[i]%2!=0 && (i+1)%2!=0)
      {
        c++;
      }
    }
      System.out.println(c);
    }
  }