import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        show(A);
        for (int i = 1; i < N; i++) {
            int v = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;
            show(A);
        }
    }

    void show(int[] A) {
        StringBuilder sb = new StringBuilder();
        for (int i : A) {
            sb.append(i);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}