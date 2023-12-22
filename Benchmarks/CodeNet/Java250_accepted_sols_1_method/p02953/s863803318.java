import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ar[] = new int[n];
    for(int i = 0;i<n;i++)
    {
      ar[i] = sc.nextInt();
    }
    boolean isComplete = true;
    for(int i = n-1;i>1;i--)
    {
      if(ar[i]>=ar[i-1])
      {
        continue;
      }
      ar[i-1]--;
      if(ar[i]>=ar[i-1]&&ar[i-1]>=0)
      {
        continue;
      }
      isComplete = false;
      break;
    }
    System.out.println(isComplete?"Yes":"No");
  }
}