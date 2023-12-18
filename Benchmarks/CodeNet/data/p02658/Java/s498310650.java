import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long m = 1;

        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
            if (A[i] == 0) {
                m = 0l;
            }
        }

        long max = (long) Math.pow(10d, 18);

        for (int i = 0; i < N; i++) {
            m *= A[i];
            if (m > max) {
                m = -1;
                break;
            }
        }

        sc.close();
        System.out.println(m);
    }
}
