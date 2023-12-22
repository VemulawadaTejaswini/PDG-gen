import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt() - (i + 1);
        }

        Arrays.sort(B);
        int meanB = B[N/2];

        long result0 = 0;
        long result1 = 0;
        long result2 = 0;

        for (int i = 0; i < N; i++) {
            result0 = result0 + Math.abs( B[i] - (meanB - 1) );
            result1 = result1 + Math.abs(B[i] - (meanB ));
            result2 = result2 + Math.abs(B[i] - (meanB + 1));
        }
        long result = Math.min(result0 , Math.min(result1,result2));
        System.out.println(result);
    }
}
