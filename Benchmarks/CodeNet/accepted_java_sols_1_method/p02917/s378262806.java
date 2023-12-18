import java.util.*;
class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int A[] = new int[n];
    int B[] = new int[n];
    for(int i = 0;i<n-1;i++)
      B[i] = in.nextInt();
    B[n-1] = B[n-2];
    int sum  = B[0];
    for(int i = 1;i<=n-1;i++)
    {
      sum += Math.min(B[i-1],B[i]);
    }
    // sum += B[n-1];
     System.out.println(sum);
  }
}