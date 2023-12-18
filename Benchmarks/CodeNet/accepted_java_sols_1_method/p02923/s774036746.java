import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    
    long[] H = new long[N];
    for (int i = 0; i < N; i++) {
        H[i] = sc.nextLong();
    }

    int gMax = 0;
    int lMax = 0;
    for (int i = 1; i < N; i++) {
        // System.out.println("H[i]=" + H[i] + ", H[i-1]=" + H[i-1]);
        if (H[i] <= H[i-1]) {
            lMax++;
            gMax = Math.max(gMax, lMax);
        } else {
            lMax = 0;
            gMax = Math.max(gMax, lMax);
        }
    }

    System.out.println(gMax);
  }
}