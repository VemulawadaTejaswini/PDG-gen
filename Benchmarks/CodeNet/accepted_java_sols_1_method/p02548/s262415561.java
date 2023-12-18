import java.util.*;

public class Main {

      public static HashMap map = new HashMap<Integer, Integer>();

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long ans = 0;
            //n - 1 1 までの、掛け算の仕方の総和
            //1 * 2 と２ * 1 は区別、1 * 1 は区別しない
            for (int i = 1; i <= Math.ceil(Math.sqrt(n - 1)); i++) {
                  for (int j = 1; j <= n-1; j++) {
                        if (i * j <= n - 1 && i <=j) {
                              if (i == j) {
                                    ans++;
                              } else {
                                    ans += 2;
                              }
                        }

                  }
            }
            System.out.println(ans);
      }


}
