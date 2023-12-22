
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;
        long B;
        long K;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
            K = sc.nextLong();
        }
        long A2 = 0;
        long B2 =0;
        if(A < K) {
            A2 = 0;
        }else {
            A2 = A - K;
        }
        long K2 = K - (A-A2);
        if(B < K2) {
            B2 = 0;
        }else {
            B2 = B - K2;
        }


        System.out.println(A2 +" "+B2);
    }
}
