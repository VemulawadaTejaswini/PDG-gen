import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

      int min_m = 1000;
      int n = sc.nextInt();
      int x = sc.nextInt();

      int ans = n;

      for(int i = 0; i < n ; i++) {
        int tmp = sc.nextInt();

        x -= tmp;

        min_m = Math.min(tmp,min_m);
      }

      //System.out.println(min_m);

      for(; x - min_m >= 0;) {
        ans++;
        x -= min_m;
        //System.out.println(x);
      }

      System.out.println(ans);
  }
}