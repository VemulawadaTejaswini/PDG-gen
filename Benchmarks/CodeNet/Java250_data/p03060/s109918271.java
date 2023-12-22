import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N;
        int[] V,C,Z;
        int sum = 0;
        N = sc.nextInt();
        V = new int[N];
        C = new int[N];
        Z = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            Z[i] = V[i] - C[i];
        }
        for (int i = 0; i < N; i++) {
            if (Z[i] > 0) {
                sum = sum + Z[i];
            }
        }
        System.out.println(sum);
    }
}