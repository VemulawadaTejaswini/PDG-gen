import java.util.*;

class Main {
        public static int[] A;
        public static int K;
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        while (true) {
                                int N = sc.nextInt();
                                if (N == 0) {
                                        break;
                                }
                                A = new int[N];
                                for (int i = 0; i < N; i++) {
                                        A[i] = sc.nextInt();
                                }
                                K = sc.nextInt();
                                System.out.println(binarysearch(0, N));
                        }
                }
        }

        public static int binarysearch(int a, int b) {
                if (a == b) {
                        return 0;
                }
                int c = (a + b) / 2;
                if (A[c] < K) {
                        return binarysearch(a, c) + 1;
                } else {
                        return binarysearch(c, b) + 1;
                }
        }
}