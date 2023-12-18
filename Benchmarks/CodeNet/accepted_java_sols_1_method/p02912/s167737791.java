import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long[] price = new long[n];
      int sum = 0;
      Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
      for (int i=0; i<n; i++) {
        int a = sc.nextInt();
        q.offer(a);
      }
      
      for (int i=0;i<m;i++) {
        int a = q.poll();
        a /= 2;
        q.offer(a);
      }
      
      long ans = 0;
      for(int i=0; i<n; i++) {
        ans += q.poll();
      }
      
      System.out.println(ans);
      
    }
}

