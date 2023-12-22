import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long[] H = new long[N];
            for (int i = 0; i < N; i++) {
                H[i] = sc.nextLong();
            }

            int ans = 0;

            int count = 0;
            for (int i = 0; i < N - 1; i++) {
                if (H[i] >= H[i + 1]) {
                    count++;
                    if (ans < count) {
                        ans = count;
                    }
                } else {
                    count = 0;
                }
            }

            System.out.println(ans);
        }
    }

}
