import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int Q = s.nextInt();

        int points[] = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = 0;
        }

        for (int i = 0; i < Q; i++) {
            int w = s.nextInt();
            points[w-1]++;
        }

        for (int i = 0; i < N; i++) {
            if (K - (Q - points[i]) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
