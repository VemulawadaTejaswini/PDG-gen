import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        if (A >= K) {
            A = A - K;
            K = 0;
        } else {
            K = K - A;
            A = 0;
        }
        if (B >= K) {
            B = B - K;
        } else {
            K = K - B;
            B = 0;
        }

        System.out.println(A + " " + B);
    }
}