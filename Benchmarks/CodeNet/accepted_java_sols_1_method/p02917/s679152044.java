import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] B = new int[N - 1];
        for(int i = 0; i < N - 1; i++) {
            B[i] = scanner.nextInt();
        }
        int ans = B[0] + B[N - 2];
        for(int i = 1; i < N - 1; i++) {
            ans += Math.min(B[i], B[i - 1]);
        }
        System.out.println(ans);
    }
}