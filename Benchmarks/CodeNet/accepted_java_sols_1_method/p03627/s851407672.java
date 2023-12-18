import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        Arrays.setAll(A, i -> Long.parseLong(sc.next()));
        Arrays.sort(A);
        long maxSide1 = 0;
        long maxSide2 = 0;
        for(int i = n - 1; i > 0; i--) {
            if(A[i] == A[i-1]) {
                if(maxSide1 < A[i]) {
                    maxSide2 = maxSide1;
                    maxSide1 = A[i];
                    A[i-1] = -1;
                } else if(maxSide2 < A[i]) {
                    maxSide2 = A[i];
                }
            }
        }
        System.out.println(maxSide1 * maxSide2);
    }
}
