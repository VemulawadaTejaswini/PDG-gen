import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // number of S
        long N = in.nextLong();
        // number of c
        long M = in.nextLong();
        long result = 0;

        if (N == 0 && M == 0) {
            result = 0;
        } else if (N >= M / 2) {
            result = M / 2;
            N -= M / 2;
            //if (N >= 0) {
            //    result += N / 2;
            //}
        } else {
            // N < M / 2
            result = N;
            M -= 2 * N;
            if (M >= 0) {
                result += M / 4;
            }
        }

        System.out.println(result);
    }
}