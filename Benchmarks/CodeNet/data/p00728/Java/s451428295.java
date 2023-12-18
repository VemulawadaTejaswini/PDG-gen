import java.util.Scanner;
import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      int n = sc.nextInt();
      if(n == 0)
      {
        break;
      }
      int[] scores = new int[n];
      int average = 0;
      for(int i = 0; i < n; i++)
      {
        scores[i] = sc.nextInt();
        average += scores[i];
      }
      Arrays.sort(scores);
      average = (average - scores[0] - scores[n - 1]) / (n - 2);
      System.out.println(average);
    } 
  }
}