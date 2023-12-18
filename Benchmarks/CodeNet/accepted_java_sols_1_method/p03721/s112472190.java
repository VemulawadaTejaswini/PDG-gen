import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] a = new int[N];
    int[] b = new int[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    sc.close();

    long[] count = new long[100001];

    for (int i = 0; i < N; i++) {
      count[a[i]] += b[i];
    }

    for (int i = 1; i <= 100000; i++) {
      if (K <= count[i]) {
        System.out.println(i);
        break;
      }
      K -= count[i];
    }
    
  }

}