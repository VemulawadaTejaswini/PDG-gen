import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = cin.nextInt();
        }

        Arrays.sort(A, Collections.reverseOrder());

        int alice = 0, bob = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                alice += A[i];
            } else {
                bob += A[i];
            }
        }

        System.out.println(alice - bob);
    }
}