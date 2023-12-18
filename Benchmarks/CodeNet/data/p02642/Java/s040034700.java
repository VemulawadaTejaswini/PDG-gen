
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        boolean[] flag = new boolean[N];

        for (int i = 0 ; i < N ; i++) {
            A[i] = scanner.nextInt();
            flag[i] = true;
        }

        Arrays.sort(A);

        for (int i = 0 ; i < N - 1 ; i++) {
            for (int j = i + 1 ; j < N ; j++) {
                if (A[i] == A[j]) {
                    flag[i] = false;
                }

                if (A[j] % A[i] == 0) {
                    flag[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 0 ; i < N ; i++) {
            if (flag[i]) count++;
        }

        System.out.println(count);
    }
}
