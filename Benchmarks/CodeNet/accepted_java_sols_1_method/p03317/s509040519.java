import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        int res = (N - 1) / (K - 1);
        if ((N - 1) % (K - 1) != 0) {
            res++;
        }

        System.out.println(res);
    }
}
