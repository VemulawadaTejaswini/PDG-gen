import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = Integer.parseInt(scan.next());
        int B = Integer.parseInt(scan.next());
        int C = Integer.parseInt(scan.next());
        int K = Integer.parseInt(scan.next());

        if (A >= K) {
            System.out.println(K);
        } else if ((A + B) >= K) {
            System.out.println(A);
        } else {
            System.out.println(A - (K - (A + B)));
        }
    }
}