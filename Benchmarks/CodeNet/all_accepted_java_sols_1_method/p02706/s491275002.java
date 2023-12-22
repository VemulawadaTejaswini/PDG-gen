import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    int N;
    int M;
    
    N = stdIn.nextInt();
    M = stdIn.nextInt();
    
    int sum = 0;
    for(int i = 0; i < M; i++)
    {
      sum += stdIn.nextInt();
    }
    
    int ans = N - sum;
    if(ans < 0)
    {
      System.out.println(-1);
    }
    else
    {
      System.out.println(ans);
    }
      
  }
}