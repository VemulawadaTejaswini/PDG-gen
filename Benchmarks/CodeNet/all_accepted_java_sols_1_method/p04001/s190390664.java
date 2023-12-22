import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //splitを使うことでStringがそれぞれ入る。
    String S[] = sc.next().split("");
    //＋の位置の場合は２の(n-1)乗
    int n = (int)Math.pow(2, S.length - 1);
    
    long total = 0;
    for (int i = 0; i < n; i++) {
      String s = S[0];//125の場合　最初の文字(1)は固定　あとの"2"5 "のどこに＋がはいるのか
      
      for (int j = 0; j < S.length - 1; j++) {
        if ((i>>j & 1) == 1) {
          total += Long.parseLong(s);
          s = S[j + 1];
        } else {
          s += S[j + 1];
        }
      }
      total += Long.parseLong(s);
    }
    System.out.println(total);
  }
}
