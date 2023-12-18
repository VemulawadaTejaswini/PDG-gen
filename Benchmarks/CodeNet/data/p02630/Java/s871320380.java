import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] seq = new int[n];
    for (int i = 0; i < n; i++) {
      seq[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    // 差だけを計算する
    Arrays.sort(seq);
    int[] sumSeq = new int[q];
    int tmp = 0;
    // 初期配列の合計
    for (int i : seq) {
      tmp += i;
    }
    int b = 0;
    int c = 0;
    int count = 0;
    for (int j = 0; j < q; j++) {
      b = sc.nextInt();
      c = sc.nextInt();
      // 個数を求めることseq[]の書き換え
      for (int k = 0; k < n; k++) {
        if (seq[k] == b) {
          count++;
          seq[k] = c;
        }
      }
      tmp += (c-b) * count;
      System.out.println(tmp);//回数分
      count = 0;
    }
  }
}
