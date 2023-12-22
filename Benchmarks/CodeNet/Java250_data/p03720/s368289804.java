import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int M = cin.nextInt();
        int[] a = new int[M * 2];
        for (int i = 0; i < M * 2; i++) {
            a[i] = cin.nextInt();
        }

        int[] x = new int[N];

        for (int i = 0; i < M * 2; i++) {
            x[a[i] - 1]++;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(x[i]);
        }
    }
}