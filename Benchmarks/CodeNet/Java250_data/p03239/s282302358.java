import java.util.Scanner;

/**
 *
 * @author Ivan Eka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int c = 0, t;
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] Route = new int[N][2];
        for (int c1 = 0; c1 < N; c1++) {
            Route[c1][0] = sc.nextInt();
            Route[c1][1] = sc.nextInt();
            if (Route[c1][1] > T) {
                count++;
            }
        }
        if (count == N) {
            System.out.println("TLE");
        } else {
            c = Route[0][0];
            for (int c2 = 0; c2 < N; c2++) {
                if (T >= Route[c2][1]) {
                    if (c > Route[c2][0]) {
                        c = Route[c2][0];
                    }
                }
            }
            System.out.println(c);
        }
    }
}