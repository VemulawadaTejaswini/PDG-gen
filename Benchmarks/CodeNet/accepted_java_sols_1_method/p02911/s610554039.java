import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();
        int Q = sc.nextInt();
        int ans;

        long[] point = new long[N];

        for (int i = 0; i < Q; i++) {
            ans = sc.nextInt();
            point[ans-1] += 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.println( (Q - (K - 1)) <= point[i] ? "Yes" : "No" );
        }
    }
}