import java.util.Scanner;

/**
 * 数球
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        {
            Long N = sc.nextLong();
            Long A = sc.nextLong();
            Long B = sc.nextLong();

            System.out.println(N/(A+B)*A+Math.min(A, N%(A+B)));
        }
    }
}
