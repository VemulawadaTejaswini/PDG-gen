import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            long mod = (long) (1e9 + 7);

            Arrays.sort(A);

            if (A[N - 1] < 0) {
                long m = 1L;
                for (int i = 0; i < K; i++) {
                    m *= (A[N - 1 - i] + mod) % mod;
                    m %= mod;
                }
                System.out.println((m + mod) % mod);
                return;
            }

            ArrayList<P> Ps = new ArrayList<P>();

            for (int i = 0; i < N; i++) {
                if (i + 1 < N && A[i] < 0 && A[i + 1] < 0) {
                    Ps.add(new P(A[i], 1));
                    Ps.add(new P(A[i + 1], 1));
                    Ps.add(new P(A[i] * A[i + 1], 2));
                    i++;
                    continue;
                }
                Ps.add(new P(A[i], 1));
            }

            Collections.sort(Ps, new Comparator<P>() {
                @Override
                public int compare(P o1, P o2) {
                    if (o1.number == o2.number) {
                        if (o1.value > o2.value) {
                            return -1;
                        }
                        if (o1.value < o2.value) {
                            return 1;
                        }
                        return 0;
                    }

                    if (o1.number < o2.number) {
                        if (o1.value * o1.value > o2.value) {
                            return -1;
                        }
                        if (o1.value * o1.value < o2.value) {
                            return 1;
                        }
                        return 0;
                    }

                    if (o1.number > o2.number) {
                        if (o1.value > o2.value * o2.value) {
                            return -1;
                        }
                        if (o1.value < o2.value * o2.value) {
                            return 1;
                        }
                        return 0;
                    }

                    return 0;
                }
            });

            long m = 1L;
            int k = 0;
            for (int i = 0; i < Ps.size(); i++) {
                if (k + Ps.get(i).number <= K) {
                    m *= Ps.get(i).value % mod;
                    m %= mod;
                    k += Ps.get(i).number;
                }
            }

            System.out.println((m + mod) % mod);
        }
    }
}

class P {
    long value;
    int number;

    public P(long value, int number) {
        super();
        this.value = value;
        this.number = number;
    }
}