import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

       // 累積和の作成
        long[] NArr = new long[N + 1];
        for (int i = 0; i <= N; i++) {
            NArr[i] = i;
        }
        long[] S = new long[N + 2];
        S[0] = 0;
        for (int i = 1; i < S.length; i++) {
            S[i] = NArr[i - 1] + S[i - 1];
        }

        // 各パターンの洗出し
        long allSum = 0;
        long modNum = (long) Math.pow((double) 10, (double) 9) + 7;
        int lastSIndex = S.length - 1;
        for (int j = K; j <= N + 1; j++) {
            long patterns = (S[lastSIndex] - S[lastSIndex - j]) - S[j];
            patterns++;
            allSum += patterns;
        }

        System.out.println(allSum % modNum);
    }
}
