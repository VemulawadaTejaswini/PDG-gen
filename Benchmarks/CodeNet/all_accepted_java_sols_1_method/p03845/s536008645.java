import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] P = new int[M];
        int[] X = new int[M];
        for (int i = 0 ; i < M ; i++) {
            P[i] = sc.nextInt();
            X[i] = sc.nextInt();
        }
        int t = 0;
        for (int i = 0 ; i < N ; i++) {
            t += T[i];
        }
        int temp = t;
        for (int i = 0 ; i < M ; i++) {
            t = t - T[P[i] - 1] + X[i];
            System.out.println(t);
            t = temp;
        }
    }

}