import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long[] b = new long[a];
    long M = (long)Math.pow(10,8);
    int result = 1;
    for(int i = 0; i < a; i++)
    {
      b[i] = sc.nextInt();
      if(b[i]  == 0)
      {
        System.out.println(0);
      	break;
      }
    }
    for(int i = 0; i < a; i++)
    {
      if(M/result < a[i])
      {
        System.out.println(-1);
      }
      else
      {
        result *= b[i];
      }
    }
    System.out.println(result);
  }
}