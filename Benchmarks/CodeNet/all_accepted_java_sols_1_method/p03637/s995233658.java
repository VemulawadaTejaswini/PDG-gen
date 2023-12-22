import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (2 <= n && n <= 1.0e5) {
      int[] sunukenoaho = new int[n];
      for (int i = 0; i < n ; i++) {
        sunukenoaho[i] = scan.nextInt();
      }
      int n4 = 0;
      int nodd = 0;
      int neven = 0;
      for (int i = 0; i < n; i++) {
        if (sunukenoaho[i] % 4 == 0) {
          n4++;
        } else if(sunukenoaho[i] % 2 == 0) {
          neven++;
        } else {
          nodd++;
        }
      }

      if (neven > 0) {
        nodd++;
      }

      if (n4 >= nodd - 1) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
