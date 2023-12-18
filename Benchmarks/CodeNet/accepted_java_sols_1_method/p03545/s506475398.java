import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s[] = sc.next().split("");
    // int型に変換しておく
    int[] v = new int[4];
    for (int i = 0; i < 4; i++) {
      v[i] = Integer.parseInt(s[i]);
    }
    sc.close();

    // ABCDの間に+,-を入れるかの選択は2^3
    // bit全探索する
    for (int i = 0; i < (1 << 3); i++) {
      int tmp = v[0];
      for (int j = 0; j < 3; j++) {
        if ((1 & i >> j) == 1) {
          tmp += v[j + 1];
        } else {
          tmp -= v[j + 1];
        }
      }
      if (tmp == 7) {
        System.out.print(v[0]);
        for (int j = 0; j < 3; j++) {
          if ((1 & i >> j) == 1) {
            System.out.print("+");
          } else {
            System.out.print("-");
          }
          System.out.print(v[j + 1]);
        }
        System.out.println("=7");
        return;
      }
    }

  }

}
