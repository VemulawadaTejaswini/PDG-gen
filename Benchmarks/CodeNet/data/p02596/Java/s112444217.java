import java.util.Scanner;

public class Main {
  static final int MOD = 1_000_000_007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    sc.close();
    if(k % 2 == 0 || k % 5 == 0) {
      System.out.println(-1);
      return;
    }
    if(k % 7 == 0) {
      k /= 7;
    }
    k = 9 * k;

    int mod = 1;
    int n = 1;
    while(n <= k){
      mod = mod * 10;
      mod = mod % k;
      if(mod == 1){
        break;
      } else {
        n++;
      }
    }
    System.out.println(n);
  }
}
