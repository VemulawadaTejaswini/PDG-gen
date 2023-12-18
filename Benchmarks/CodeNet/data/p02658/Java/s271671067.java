import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long[] b = new long[a];
    long result = 1l;
    
    for(int i = 0; i < a; i++)
    {
      b[i] = sc.nextLong();
      if(a[i] == 0)
        System.out.println(0);
    } 
    
    for(int i = 0; i < a; i++)
    {
       result = result * b[i];
      if(Math.pow(10,18) < result)
      {
        result = -1;
        break;
      }
    }
   
    System.out.println(result);
  }
}
