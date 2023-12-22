import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ball = new int[10];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 10; j++) {
        ball[j] = sc.nextInt();
      }
      int aTop = 0;
      int bTop = 0;
      boolean res = true;
      for (int j = 0; j < 10; j++) {
        if (aTop > bTop && ball[j] > aTop) {
          aTop = ball[j];
        }
        else if (ball[j] > bTop) {
          bTop = ball[j];
        }
        else if (ball[j] > aTop) {
          aTop = ball[j];
        }
        else {
          res = false;
        }
      }
      System.out.println(res ? "YES":"NO");
    }
  }
}