import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int sum=0;
    int count=0;
    for(int i=0;i<n;i++)
    {
      sum=sum+arr[i];
      if(sum == x)
      {
        count++;
        break;
      }
      else if(sum > x)
        break;
      else
      {
        count++;
      }
    }
    count++;
    System.out.println(count);
  }
}