import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            long[] L = new long[87];
            L[0] = 2;
            L[1] = 1;
            for (int i = 2; i < L.length; i++) {
                L[i] = L[i - 1] + L[i - 2];
            }

            System.out.println(L[N]);
        }
    }
}
