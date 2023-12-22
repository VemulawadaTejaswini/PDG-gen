import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ARRAY = new int[N];

        int maxIndex = 0;
        int max = 0;
        for (int i=0; i<N; i++) {
            ARRAY[i] = scanner.nextInt();
            if (ARRAY[i] > max) {
                max = ARRAY[i];
                maxIndex = i;
            }
        }

        int[] MAX_ARRAY = new int[N];
        for (int i=0; i<N; i++) {
            if (i == maxIndex) {
                int max2 = 0;
                for (int k=0; k<N; k++) {
                    if (k == i) {
                        continue;
                    }
                    if (ARRAY[k] > max2) {
                        max2 = ARRAY[k];
                        MAX_ARRAY[i] = max2;
                    }
                }
                continue;
            }
            MAX_ARRAY[i] = max;
        }

        for (int i=0; i<N; i++) {
            System.out.println(MAX_ARRAY[i]);
        }
    }
}
