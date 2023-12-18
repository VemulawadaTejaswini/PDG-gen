import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long[] b = new long[a];
    long MAX = (long)Math.pow(10,18);
    long result = 1;
    
    
    for(int i = 0; i < a; i++)
    {
      b[i] = sc.nextLong();
      if(b[i]  == 0)
      {
        System.out.println(0);
      	return;
      }
    }
    
    
    for(int i = 0; i < a; i++)
    {
      if(MAX/result < b[i])
      {
        System.out.println(-1);
        return;
      }
      else
      {
        result *= b[i];
      }
    }
    System.out.println(result);
  }
}
