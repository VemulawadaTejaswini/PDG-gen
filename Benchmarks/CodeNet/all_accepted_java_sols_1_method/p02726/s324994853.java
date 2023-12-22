import java.util.*;


class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int d[] = new int[N];

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int dij = Math.min(j - i, Math.abs(X - i) + 1 + Math.abs(j - Y));
                dij = Math.min(dij, Math.abs(Y - i) + 1 + Math.abs(j - X));
                d[dij]++;
            }
        }

        for (int i = 1; i < N; i++) {
            System.out.println(d[i]);
        }
    }
}
