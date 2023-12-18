import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    if (N == 1) { System.out.println(1); return; }

    int max = Integer.MIN_VALUE;
    for (int i = 2; i <= N; i++) {
      for (int j = 2; j <= N; j++ ){
        double pow = Math.pow((double)i, (double)j);
        if (pow > N) break;

        max = Math.max((int)pow, max);
      }
    }
    System.out.println(max);

        // 10の場合
        // 2^2, 2^3, 2^4 > 10
        // 3^2, 3^3 > 10
        // 4^2 > 10
  }
}
