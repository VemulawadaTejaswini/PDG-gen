import java.util.Scanner;

public class Main {
    static final int INF = (int)Math.pow(10, 9);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] c = new int[N];
        int[] t = new int[N];
        int min_cost = INF;
        for (int i = 0; i < N; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if (t[i] <= T) {
                min_cost = Math.min(min_cost, c[i]);
            }
        }
        if (min_cost == INF) {
            System.out.println("TLE");
        } else {
            System.out.println(min_cost);
        }
        sc.close();
    }
}