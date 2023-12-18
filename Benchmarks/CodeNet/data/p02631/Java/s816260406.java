import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] R = new int[N];
        Arrays.fill(R,0);

        int digit = 1;
        while(digit <= 1000000000){

            int C = 0;
            for (int i = 0; i < N; i++) {
                C = C ^ (A[i] & digit);
            }

            for (int i = 0; i < N; i++) {
                R[i] += digit & (C ^ A[i]);
            }

            digit = digit << 1;
        }

        System.out.print(R[0]);
        for (int i = 1; i < N; i++) {
            System.out.print(" " + R[i]);
        }
    }
}
