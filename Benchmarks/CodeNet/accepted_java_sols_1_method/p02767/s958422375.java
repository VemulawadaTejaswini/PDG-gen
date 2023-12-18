import java.util.Scanner;

/**
 * TITLE : Rally URL
 * https://atcoder.jp/contests/abc156/tasks/abc156_c
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int min = 100;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            sum += X[i];
            min = min > X[i] ? X[i] : min;
            max = max < X[i] ? X[i] : max;
        }

        long P = Math.round((double) sum / X.length);
        int answer = 0;
        for (int i = 0; i < X.length; i++) {
            answer += (X[i] - P) * (X[i] - P);
        }
        System.out.println(answer);
        sc.close();
    }
}