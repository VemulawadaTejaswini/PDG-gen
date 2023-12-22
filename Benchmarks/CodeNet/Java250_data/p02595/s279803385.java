import java.util.Scanner;
public class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int result = 0;
    
    for(int i = 0; i < p; i++)
    {
      double x1 = sc.nextDouble();
      double x2 = sc.nextDouble();
      double dis = Math.sqrt(Math.pow(x1,2) + Math.pow(x2,2));
    if(dis <= q)
      result++;
    }
    System.out.println(result);
  }
}
