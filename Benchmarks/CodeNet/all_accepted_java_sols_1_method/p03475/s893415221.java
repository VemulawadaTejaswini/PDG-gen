import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = Integer.parseInt(in.next());

            int[] C = new int[N - 1];
            int[] S = new int[N - 1];
            int[] F = new int[N - 1];

            for (int i = 0; i < N - 1; i++) {
                C[i] = Integer.parseInt(in.next());
                S[i] = Integer.parseInt(in.next());
                F[i] = Integer.parseInt(in.next());
            }

            for (int i = 0; i < N; i++) {
                int time = 0;
                for (int station = i; station < N - 1; station++) {
                    if (time <= S[station]) {
                        time = S[station];
                    } else {
                        if ((time - S[station]) % F[station] == 0) {
                            time = S[station] + (time - S[station]) / F[station] * F[station];
                        } else {
                            time = S[station] + ((time - S[station]) / F[station] + 1) * F[station];
                        }
                    }

                    time += C[station];

                }

                System.out.println(time);
            }

        }
    }
}
