import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int v = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;

            println(A);
        }

        sc.close();
    }

    private static void println(int[] A) {
        int N = A.length;
        String[] sb = new String[N];
        for (int i = 0; i < N; i++) {
            sb[i] = String.valueOf(A[i]);
        }
        System.out.println(String.join(" ", sb));
    }
}
