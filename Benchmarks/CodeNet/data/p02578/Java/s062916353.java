import java.util.*;

public class Main
{
  public static void main(String[] args)
  {  	
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int[] arr = new int[n];

    long total = 0;

    int p = sc.nextInt();
    for (int i = 1; i<n; i++)
    {
        int c = sc.nextInt();
        if (p - c > 0)
        {
            total += p - c;
            c = p;
        }
        p = c;
    }

    System.out.println(total);
  }
}