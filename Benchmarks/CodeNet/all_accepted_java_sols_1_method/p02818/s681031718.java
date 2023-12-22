import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
 
        long ans1 = (A < K) ? 0 : A - K;
        long ans2 = (A < K) ? B - (K - A) : B;
        if (ans2 < 0) ans2 = 0;
        System.out.println(ans1 + " " + ans2);
    }
}