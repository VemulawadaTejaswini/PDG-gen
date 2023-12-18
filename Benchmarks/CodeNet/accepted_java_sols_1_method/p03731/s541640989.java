import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
        }

        long total = T;
        for (int i = t.length - 1; i > 0; i--) {
            total += Math.min(t[i] - t[i-1], T);
        }

        System.out.println(total);
    }
}