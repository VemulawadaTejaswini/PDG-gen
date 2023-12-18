import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int N = sc.nextInt(), Q = sc.nextInt();
                        String[] SS = new String[N];
                        int[] NN = new int[N];
                        for (int i = 0; i < N; i++) {
                                SS[i] = sc.next();
                                NN[i] = Integer.parseInt(sc.next());
                        }
                        int count = 0;
                        int sum = 0;
                        int min = 1 << 30;
                        for (int j = 0; j < N; j++) {
                                min = Math.min(min, NN[j]);
                        }
                        int XX = (min / Q - 1);
                        if (XX > 0) {
                                for (int j = 0; j < N; j++) {
                                        NN[j] -= XX * Q;
                                        sum += XX * Q * N;
                                }
                        }
                        while (count < N) {
                                for (int i = 0; i < N; i++) {
                                        if (NN[i] > 0) {
                                                NN[i] -= Q;
                                                sum += Q;
                                                if (NN[i] <= 0) {
                                                        sum +=NN[i];
                                                        System.out.println(SS[i] + " " + sum);
                                                        count++;
                                                        for (int j = 0; j < N; j++) {
                                                                if (NN[j] > 0) {
                                                                        min = Math.min(min, NN[j]);
                                                                }
                                                        }
                                                        XX = (min / Q - 1);
                                                        if (XX > 0) {
                                                                for (int j = 0; j < N; j++) {
                                                                        if (NN[j] > 0) {
                                                                                NN[j] -= XX * Q;
                                                                                sum += XX * Q * N;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
}