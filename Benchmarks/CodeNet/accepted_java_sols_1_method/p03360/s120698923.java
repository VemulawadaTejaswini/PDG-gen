import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int max = Math.max(Math.max(A, B), C);
        int ans = 0;

        if (max == A) {
            ans = (int)Math.pow(2, K) * A + B + C;
        } else if(max == B) {
            ans = (int)Math.pow(2, K) * B + A + C;
        } else {
            ans = (int)Math.pow(2, K) * C + A + B;
        }
        System.out.println(ans);
    }
}