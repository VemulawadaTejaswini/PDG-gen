import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int ans[] = new int[n];
    
    for(int i = 0; i < n; i++)
    {
      ans[i] = 0;
    }
    
    for(int i = 0; i < n-1; i++){
      ans[stdIn.nextInt()-1] ++;
    }
    
    for(int i = 0; i < n; i++){
      System.out.println(ans[i]);
    }
  }
}
