import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    int[] a = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    sc.close();

    int cost = Integer.MAX_VALUE;

    for (int i = -100; i <= 100; i++) {
      int cost_ = 0;
      for (int j = 0; j < N; j++) {
        cost_ += (a[j] - i) * (a[j] - i);
      }
      cost = Math.min(cost, cost_);
    }
    
    System.out.println(cost);

  }

}