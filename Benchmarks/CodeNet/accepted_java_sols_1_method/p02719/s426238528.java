import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long K = sc.nextLong();
        N = N % K;
        N = Math.min(Math.abs(N-K), N);
        System.out.println(N);
    }
}
