import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N + 1];
            for (int i = 0; i < N; i++) {
                a[i + 1] = in.nextInt();
            }
            int[] boxBalls = new int[N + 1];
            for (int i = N; i >= 1; i--) {
                int sumBalls = 0;
                for (int j = i; j < boxBalls.length; j += i) {
                    sumBalls += boxBalls[j];
                }
                boxBalls[i] = sumBalls % 2 == a[i] ? 0 : 1;
            }

            int M = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = N; i >= 1; i--) {
                if (boxBalls[i] > 0) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(i);
                    M++;
                }
            }
            System.out.println(M);
            System.out.println(sb.toString());
        }
    }
}
