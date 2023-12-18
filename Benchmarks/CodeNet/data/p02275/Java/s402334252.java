/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_6_A&lang=jp
 */
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int SIZE = 10001;
        int[] ary = new int[SIZE];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ary[x]++;
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < ary[i]; j++)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
