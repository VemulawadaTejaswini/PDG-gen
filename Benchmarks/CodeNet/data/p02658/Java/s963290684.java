import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long sum = 1;
    long lim = (long) Math.pow(10, 18);
    boolean flg = true;

    for (int i = 0; i < n; i++) {
      long tmp = sc.nextLong();
      if(tmp == 0) {
        System.out.println(0);
        return;
      }
      sum *= tmp;
      if (sum > lim) {
        flg = false;
      }
    }

    if(flg) {
      System.out.println(sum);
    } else {
      System.out.println(-1);
    }

  }
}