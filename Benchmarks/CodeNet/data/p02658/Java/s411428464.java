import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;
        long[] A = new long[n];
        for(int i = 0; i < n; i++) A[i] = Long.parseLong(sc.next());
        Arrays.sort(A);
        for(int i = 0; i < n; i++) {
            if(res * A[i] > 1000_000_000_000_000_000L || (res > res * A[i])) {
                res = -1;
                break;
            }
            res *= A[i];
        }
        if(A[0] == 0) res = 0;
        System.out.println(res);
    }
}
