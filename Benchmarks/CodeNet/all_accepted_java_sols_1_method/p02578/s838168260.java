import java.util.*;
public class Main
{
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[]args)
  {
    int n = sc.nextInt();
    int[]height = new int[n];
    for(int i=0;i<n;i++)
      height[i]=sc.nextInt();
    int max = height[0];
    long total =0;
    for(int i=1;i<n;i++)
    {
      if(height[i]==max)
        continue;
      else if(height[i]<max)
        total+=max-height[i];
      else
      {
        max = height[i];
      }
    }
    System.out.println(total);
  }
}
