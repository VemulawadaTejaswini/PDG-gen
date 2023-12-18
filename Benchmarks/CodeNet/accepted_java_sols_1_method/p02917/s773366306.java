

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = IntStream.range(0, n - 1).map(e -> sc.nextInt()).toArray();

        a[0] = b[0];
        for (int i = 1; i < n - 1; i++) {
            a[i] = Math.min(b[i], b[i - 1]);
        }
        a[n - 1] = b[n - 2];

        System.out.println(IntStream.of(a).sum());
        sc.close();
    }
}