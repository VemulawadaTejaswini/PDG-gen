import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();
        long K = sc.nextLong();
        long rem = N % K;
        System.out.println(Math.min(rem, K - rem));
    }
}
