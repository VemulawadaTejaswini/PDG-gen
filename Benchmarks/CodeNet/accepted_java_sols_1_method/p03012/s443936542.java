import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W[] = new int[N];
        int totalW = 0;
        int S1 = 0;
        int S2 = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            W[i] = sc.nextInt();
            totalW = totalW + W[i];
        }

        for (int i = 0; i < N; i++) {
            S1 = S1 + W[i];
            S2 = totalW - S1;
            if (Math.abs(S1 - S2) < minAbs) {
                minAbs = Math.abs(S1 - S2);
            }
            if (minAbs == 0) {
                break;
            }
        }
        System.out.println(minAbs);
        sc.close();
    }
}