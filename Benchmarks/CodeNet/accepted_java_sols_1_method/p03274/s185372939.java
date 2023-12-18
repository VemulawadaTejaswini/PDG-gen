import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int K = in.nextInt();
      int[] x = new int[N];
      
      for (int i = 0; i < x.length; ++i) {
        x[i] = in.nextInt();
      }

      int left = 0;
      int right = left + K - 1;
      int time = 0;
      int minTime = Integer.MAX_VALUE;
      while (right < x.length) {
        if (x[right] <= 0) {
          time = Math.abs(x[left]);
        } else if (0 <= x[left]) {
          time = x[right];
        } else {
          time = Math.min(Math.abs(x[left]), x[right]) * 2 + Math.max(Math.abs(x[left]), x[right]);
        }
        
        minTime = Math.min(minTime, time);
        ++left;
        ++right;
      }

      System.out.println(minTime);
    }
  }
}