import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        double m = 1d;

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
            if (A[i] == 0) {
                m = 0d;
            }
        }

        sc.close();
        long max = (long) Math.pow(10d, 18);

        for (int j = 0; j < N; j++) {
            m = m * A[j];
            if (m > max || m < 0) {
                m = -1;
                break;
            }
        }

        System.out.println(m);
    }
}
