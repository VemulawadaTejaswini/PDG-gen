import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] v = new int[N];
        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = sc.nextInt();
        }

        int V = 0;
        for (int i = 0; i < N; i++) {
            int C = sc.nextInt();
            if (v[i] > C) {
                V += v[i] - C;
            }
        }
        System.out.println(V);
    }
}