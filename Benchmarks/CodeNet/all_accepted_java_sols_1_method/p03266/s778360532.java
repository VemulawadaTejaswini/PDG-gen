import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    if (K % 2 == 1) { // Kが奇数
      for (int i = 1; i <= N; i++) {
        if (i % K == 0) {
          odd.add(i);
        }
      }
    } else { // Kが偶数
      for (int i = 1; i <= N; i++) {
        if (i % K == 0) {
          odd.add(i);
        } else if (i % K == K / 2) {
          even.add(i);
        }
      }
    }
    System.out.println((long) Math.pow((double) odd.size(), 3.0) + (long) Math.pow((double) even.size(), 3.0));
  }
}
