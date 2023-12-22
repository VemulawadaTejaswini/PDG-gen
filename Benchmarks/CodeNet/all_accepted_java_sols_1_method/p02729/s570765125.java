import java.util.Scanner;

/**
 * TITLE : The Number of Even Pairs
 * URL : https://atcoder.jp/contests/abc159/tasks/abc159_a
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        int answer = 0;
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                answer++;
            }
        }
        for (int i = 1; i < M; i++) {
            for (int j = i; j < M; j++) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}