import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());
        System.out.println(value(N,K));
    }

    public static long value(long N, long K) {
        if (N%K > K-(N%K)) {
            return K - (N%K);
        }

        else {
            return N%K;
        }
    }
}


