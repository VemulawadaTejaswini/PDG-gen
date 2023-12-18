import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int res = Integer.MAX_VALUE;
        int prev = 1;
        for (int i = 0; i < N; i++) {
            int A = prev * 2;
            int B = prev + K;
            if (A < B) prev = A;
            else prev = B;
        }
        System.out.println(prev);
    }
}
