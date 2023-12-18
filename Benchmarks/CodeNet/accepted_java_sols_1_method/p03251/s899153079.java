import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt(), x[] = new int[N], y[] = new int[M];
        for (int i = 0; i < N; ++i) x[i] = sc.nextInt();
        for (int i = 0; i < M; ++i) y[i] = sc.nextInt();
        sc.close();
        Arrays.sort(x);
        Arrays.sort(y);
        if (y[0] > x[N - 1] && y[0] > X && Y >= y[0]) System.out.print("No War");
        else System.out.print("War");
    }
}