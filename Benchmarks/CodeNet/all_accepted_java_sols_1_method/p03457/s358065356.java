import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N+1];
        int[] X = new int[N+1];
        int[] Y = new int[N+1];
        T[0] = X[0] = Y[0] = 0;
        boolean yes = true;
        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            int d = Math.abs(X[i] - X[i-1]) + Math.abs(Y[i] - Y[i-1]);
            int dt = T[i] - T[i-1];
            if (d > dt || d%2 != dt%2) {
                yes = false;
                break;
            }
        }
        System.out.println(yes ? "Yes" : "No");
    }
}
