import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            int N = S.length();

            boolean[] isATCG = new boolean[N];
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                isATCG[i] = c == 'A' || c == 'T' || c == 'C' || c == 'G';
            }

            int max = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (isATCG[i]) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    count = 0;
                }
            }
            System.out.println(max);
        }
    }
}
