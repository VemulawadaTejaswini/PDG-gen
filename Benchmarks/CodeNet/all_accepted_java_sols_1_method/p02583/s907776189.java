
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] L = new long[N];

        for (int i = 0 ; i < N ; i++) {
            L[i] = scanner.nextLong();
        }

        int count = 0;

        for (int i = 0 ; i < N - 2 ; i++) {
            for (int j = i + 1 ; j < N - 1 ; j++) {
                for (int k = j + 1 ; k < N ; k++) {
                    long[] l = new long[3];
                    l[0] = L[i];
                    l[1] = L[j];
                    l[2] = L[k];
                    Arrays.sort(l);
                    if (L[i] != L[j] && L[j] != L[k] && L[k] != L[i] && l[0] + l[1] > l[2]) {
//                        System.out.printf("%d %d %d%n", i + 1, j + 1, k + 1);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
