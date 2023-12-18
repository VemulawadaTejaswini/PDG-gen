import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] seq = new int[100001];
    long tmp = 0;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      tmp += a;
      seq[a]++;
    }
    int q = sc.nextInt();
    // 差だけを計算する

    for (int j = 0; j < q; j++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      seq[c] += seq[b];
      tmp += (c - b) * seq[b];
      System.out.println(tmp);
      seq[b] = 0;
    }
  }
}