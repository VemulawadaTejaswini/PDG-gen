import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans =0;
        long[] nums = new long[N+1];
        for (int i = 1; i <= N; i++) {
            long  ni =N/i;
            long l = i * ni*(ni+1)/2;
            ans += l;
        }
        System.out.println(ans);
    }
}