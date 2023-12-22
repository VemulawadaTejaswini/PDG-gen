import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();
        sc.close();

        if (K - A < 0) {
            System.out.println(K);
        } else if (K - (A + B) < 0) {
            System.out.println(A);
        } else {
            System.out.println(A - (K - (A + B)));
        }
    }
}
