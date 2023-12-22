import java.util.*;
 
 public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tot = 0;
    for(int i = 1 ; i <= n ; i++)
    {
      int x = sc.nextInt();
      if(x%2 == i%2 && i%2 == 1)
        tot++;
    }
    System.out.println(tot);
  }
}