import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int N = sc.nextInt();
    int L = sc.nextInt();
    int min =300, total =0;
    for (int i=1; i<=N; i++) {
      total += L + i -1;
    }
    if (L >= 0) {
      System.out.println(total - L);
    } else if (L < 0) {
      if (L + N > 0) {
        System.out.println(total);
      } else {
        System.out.println(total - (L + N - 1));
      }
    }
  }
}