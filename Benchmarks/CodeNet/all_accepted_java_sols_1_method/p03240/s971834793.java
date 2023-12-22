import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] x = new int[N];
    int[] y = new int[N];
    int[] h = new int[N];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      h[i] = sc.nextInt();
    }

    sc.close();

    // 最大は100
    int max = 100;

    for (int i = 0; i <= max; i++) {
      for (int j = 0; j <= max; j++) {
        
        // あるべき高さ -2:調査中止 -1:継続調査 0以上:高さ確定
        int height = -1;
        
        for (int k = 0; k < N; k++) {
          
          if (h[k] > 0) {

            int tmp = h[k] + Math.abs(i - x[k]) + Math.abs(j - y[k]);

            if (height == -1) {
              height = tmp;
            } else {
              if (height != tmp) {
                height = -2;
                break;
              }
            }

          }

        }

        if (height == -2) {
          continue;
        }

        for (int k = 0; k < N; k++) {
          
          if (h[k] == 0) {
            int tmp = Math.abs(i - x[k]) + Math.abs(j - y[k]);
            if (height > tmp) {
              height = -2;
              break;
            }
          }

        }

        if (height == -2) {
          continue;
        }

        System.out.println(i + " " + j + " " + height);

      }
    }

  }

}