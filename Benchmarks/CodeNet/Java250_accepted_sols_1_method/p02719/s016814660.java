import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Long N = input.nextLong();
        Long K = input.nextLong();
        long ans;

        if (N % K == 0) {
            ans = 0;
        } else {
            ans = ((N % K) <= (K / 2)) ? (N % K) : (K - (N % K));
        }
        System.out.println(ans);
    }
}
