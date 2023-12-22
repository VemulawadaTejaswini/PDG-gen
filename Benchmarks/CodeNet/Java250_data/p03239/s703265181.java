import java.util.*;

public class Main {
    public static void main(String args[]) {
        int N, T;
        int min = 9999;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        T = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            int c = scanner.nextInt();
            int t = scanner.nextInt();
            if (t <= T) {
                if (c < min) {
                    min = c;
                }
            }
        }
        if (min == 9999) {
            System.out.println("TLE");
        } else {
            System.out.println(min);
        }
    }
}