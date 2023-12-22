import java.util.*;
public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine().trim();
        String[] segments = S.split(" ");
        int N = Integer.parseInt(segments[0]);
        int K = Integer.parseInt(segments[1]);

        double result = 0;
        double np = (double)1.0 / N;
        for (int i = 1; i <= N; i++) {
            result += np * calcP(i, K);
        }
        System.out.println(result);
    }

    private static double calcP(int n, int k) {
        int score = n;
        int cnt = 0;
        while (score < k) {
            cnt++;
            score *= 2;
        }

        if (cnt > 0) {
            return Math.pow((double)0.5, cnt);
        } else {
            return 1;
        }
    }
}
