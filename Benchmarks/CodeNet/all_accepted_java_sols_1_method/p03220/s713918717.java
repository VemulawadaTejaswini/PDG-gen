import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();

    int[] H = new int[N];

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    sc.close();

    double d0 = 999999;
    int p = 0;

    for (int i = 0; i < N; i++) {

      double d1 = T - H[i] * 0.006;
      double d2 = Math.abs(A - d1);

      if (d2 <= d0){
        d0 = d2;
        p = i;
      }

    }

    System.out.println(p+1);

  }

}