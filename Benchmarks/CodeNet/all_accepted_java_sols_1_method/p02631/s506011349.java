

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i ++ ) {
            A[i] = sc.nextLong();
        }

        long res = 0;
        for (int i = 0; i < N; i ++ ) {
            res ^= A[i];
        }
        long[] resArr = new long[N];
        for (int i = 0; i < N; i ++ ) {
            resArr[i] = A[i] ^ res;
        }
        for (int i = 0; i < resArr.length; i ++ ) {
            System.out.print(resArr[i] + " ");
        }

        System.out.println();

    }
}
