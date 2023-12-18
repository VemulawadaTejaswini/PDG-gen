import java.util.*;
import java.io.*;

class Main {

  static int[][][] residence = new int[4][3][10];
  static int m = 0;

  public static void main(String[] args) {
    int[] v = new int[4];
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    init();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      // line???????????§split???????????¨?±??????¨????????°?????±?????´??°????????????
      String[] s = sc.nextLine().split(" ");
      for (int j = 0; j < 4; j++) {
        v[j] = Integer.parseInt(s[j]);
      }
      residence[v[0] - 1][v[1] - 1][v[2] - 1] = residence[v[0] - 1][v[1] - 1][v[2] - 1] + v[3];
    }
    output();
  }

  static void init() {
    for (int[][] building : residence) { for (int[] floor : building) {
       for (int room : floor) { room = 0; } } }
  }

  static void output() {
    for (int[][] building : residence) {
      m++;
      for (int[] floor : building) { for (int room : floor) { System.out.print(" " + room); }
        System.out.println(); }
      if (m != 4) System.out.println("####################");
    }
  }

}