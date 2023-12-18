import java.util.*;
import java.util.PriorityQueue;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    PriorityQueue<Double> q = new PriorityQueue<Double>();
    for(int i = 0; i < n; ++i)
    {
      double x = sc.nextDouble();
      q.add(x);
    }
    while(q.size() > 1)
    {
      double a = q.poll();
      double b = q.poll();
      q.add((a+b)/2.0);
    }
    double ans = q.poll();

    System.out.println(ans);
  }

}
