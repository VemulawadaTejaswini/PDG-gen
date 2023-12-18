import java.util.*;
class Main{
  static int counter;
  static int n;
  static int s;

  public static void makeC(int m, int n, int sum){
    if (n == 0) {
      if (sum == s) {
        counter++;
      }
    }
    else {
      for (int i = m; i < 10; i++) {
        makeC(i + 1, n - 1, sum + i);
      }
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true) {
      n = sc.nextInt();
      s = sc.nextInt();
      if (n == 0 && s == 0) {
        break;
      }
      counter = 0;
      makeC(0, n, 0);
      System.out.println(counter);
    }
  }
}