import java.util.*;
public class Main {
    private static long dp[][];
    private static int N;
    private static int A[];
    private static int B[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt() * 1000;
        int A = sc.nextInt() * 1000;
        int H[] = new int[N];
        for(int i=0; i<N; i++) {
            H[i] = sc.nextInt();
        }

        int X[] = new int[N];
        for(int i=0; i<N; i++) {
            X[i] = Math.abs((T - H[i] * 6) - A);
        }

        int res = 0;
        int minval = X[0];
        for(int i=0; i<N; i++) {
            if(minval > X[i]) {
                minval = X[i];
                res = i;
            }
        }
        System.out.println(String.format("%d", res + 1));
    }
}
