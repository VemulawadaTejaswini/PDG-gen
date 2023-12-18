import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] S = new int[M];
        char[] C = new char[M];
        for (int i = 0; i < M; i++) {
            S[i] = sc.nextInt();
            C[i] = (char) ('0' + sc.nextInt());
        }

        int ans;
        if (N == 1) {
            ans = 0;
        } else if (N == 2) {
            ans = 10;
        } else {
            ans = 100;
        }

        while (true) {
            char[] c = Integer.toString(ans).toCharArray();

            if (c.length > N) {
                ans = -1;
                break;
            }

            boolean valid = true;
            for (int i = 0; i < M; i++) {
                if (c[S[i] - 1] != C[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                break;
            }

            ans++;
        }

        System.out.println(ans);
    }

}
