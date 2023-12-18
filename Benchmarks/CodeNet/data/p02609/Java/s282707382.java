import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static int[] pp;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String X = sc.next();
    int count1 = (int) X.chars().filter(ch -> ch == '1').count();
    pp = new int[N + 1];
    Arrays.fill(pp, -1);
    pp[0] = 0;
    pp[1] = 1;
    int[][] fa = new int[N][2];
    fa[0][0] = (count1 > 1) ? 1 : 0;
    fa[0][1] = (count1 > 0) ? 1 : 0;
    for (int i = 1; i < N; i++) {
      fa[i][0] = (count1 > 1) ? (fa[i - 1][0] * 2) % (count1 - 1) : 0;
      fa[i][1] = (count1 > 0) ? (fa[i - 1][1] * 2) % (count1 + 1) : 0;
    }
    int answer0to1 = 0;
    int answer1to0 = 0;
    for (int i = 0; i < N; i++) {
      if (X.charAt(i) == '1') {
        answer1to0 = (answer1to0 + fa[N - 1 - i][0]) % (count1 - 1);
        answer0to1 = (answer0to1 + fa[N - 1 - i][1]) % (count1 + 1);
      }
    }
    for (int i = 0; i < N; i++) {
      int tmp = 0;
      if(X.charAt(i) == '0'){
        if(count1 == 0){
          tmp = 1;
        } else {
          tmp = (answer0to1 + fa[N - 1 - i][1]) % (count1 + 1);
        }
      } else {
        if(count1 == 1){
          tmp = 0;
        } else {
          tmp = Math.abs(answer1to0 - fa[N - 1 - i][0]) % (count1 - 1);
        }
      }
      System.out.println(popcount(tmp) + 1);
    }
  }

  static private int popcount(int n) {
    if (pp[n] != -1) {
      return pp[n];
    } else {
      pp[n] = popcount(n % Integer.bitCount(n)) + 1;
      return pp[n];
    }
  }
}