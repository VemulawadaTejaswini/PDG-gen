

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] p = IntStream.range(0, n).map(e -> 0).toArray();
        for (int i = 0; i < q; i++) {
            p[sc.nextInt() - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (q - k < p[i]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}