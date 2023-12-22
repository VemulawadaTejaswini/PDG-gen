import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
    for (int i=1; i<N; i++) {
      int n = sc.nextInt();
      array[n-1] += 1;
    }
    for (int ans : array)
      System.out.println(ans);
  }
}