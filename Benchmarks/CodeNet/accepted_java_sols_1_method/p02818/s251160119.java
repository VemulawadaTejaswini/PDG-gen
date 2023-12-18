import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        if (K <= A) {
            A = A - K;
            K = 0;
        } else {
            K = K - A;
            A = 0;
        }
        if (K <= B) {
            B = B - K;
            K = 0;
        } else {
            K = K - B;
            B = 0;
        }
        System.out.println(A + " " + B);
    }
}
