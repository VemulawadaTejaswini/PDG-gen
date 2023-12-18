import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] L = new int[N];
            for (int i = 0; i < N; i++) {
                L[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (L[j] == L[i]) {
                        continue;
                    }

                    for (int k = j + 1; k < N; k++) {
                        if (L[k] == L[i] || L[k] == L[j]) {
                            continue;
                        }

                        int max = Math.max(L[i], Math.max(L[j], L[k]));
                        if (L[i] == max) {
                            if (L[j] + L[k] > max) {
                                count++;
                            }
                        }
                        if (L[j] == max) {
                            if (L[i] + L[k] > max) {
                                count++;
                            }
                        }
                        if (L[k] == max) {
                            if (L[i] + L[j] > max) {
                                count++;
                            }
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}
