import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] ans = new int[N];
    for (int i=0; i<N; i++) {
      ans[i] = sc.nextInt();
    }
    int count =0;
    int end =0;
    while (true) {
      for (int i=0; i<N; i++) {
        if (ans[i] % 2 == 0) {
          ans[i] /= 2;
        } else {
          end++;
          break;
        }
      }
      if (end != 0) break;
      count++;
    }
    System.out.println(count);
  }
}