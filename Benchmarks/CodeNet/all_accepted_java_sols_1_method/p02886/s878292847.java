

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] d = IntStream.range(0, sc.nextInt()).map(e -> sc.nextInt()).toArray();
        int ans = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if (i != j)
                    ans += d[i] * d[j];
            }
        }

        System.out.println(ans / 2);
        sc.close();
    }
}