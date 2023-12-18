
/* Volume0-0001(山の高さ) */

import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    // 入力された値をゲット
    Scanner sc = new Scanner(System.in);

    // 10個の要素を持つ配列を作成
    Integer[] yama = new Integer[10];

    // 入力値を配列にセット(10×繰り返し)
    for(int i=0; i<10; i++) {
      yama[i] = sc.nextInt();
    }

    // 降順で並び替え
    Arrays.sort(yama, Collections.reverseOrder());

    // 上位３つを画面に出力
    System.out.println(yama[0]);
    System.out.println(yama[1]);
    System.out.println(yama[2]);
  }
}

