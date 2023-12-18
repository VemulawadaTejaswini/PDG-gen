import java.util.Scanner;

/**
 * ABC044A
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int cost = 0;
        for (int i = 1; i <= N; i++) {
            if (i <= K) {
                cost += X;
            } else {
                cost += Y;
            }
        }

        System.out.println(cost);
        sc.close();
    }
}