import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// C - Fennec vs Monster
// https://atcoder.jp/contests/abc153/tasks/abc153_c
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());
        Long[] H = new Long[N];
        for (int i = 0; i < N; i++) {
            H[i] = Long.parseLong(scanner.next());
        }
        scanner.close();

        // HPの高い順に必殺技を使いたいのでHPの降順にする
        Arrays.sort(H, Collections.reverseOrder());

        long attackCount = 0;
        for (int i = K; i < N; i++) {
            attackCount += H[i];
        }

        System.out.println(attackCount);
    }
}
