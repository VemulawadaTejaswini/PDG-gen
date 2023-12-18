import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int X = sc.nextInt();
            int N = sc.nextInt();
            int[] p = new int[N];
            for (int i = 0; i < N; i++) {
                p[i] = sc.nextInt();
            }

            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < N; i++) {
                set.add(p[i]);
            }

            int min = (int) 1e9;
            int minY = (int) 1e9;
            for (int y = -100; y <= 200; y++) {
                if (set.contains(y)) {
                    continue;
                }
                if (Math.abs(y - X) < min) {
                    min = Math.abs(y - X);
                    minY = y;
                }
            }
            System.out.println(minY);
        }
    }
}
