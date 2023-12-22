import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        /*calculate K*(K - 1)^(N - 1)*/
        long result = K;
        for (int i = 1; i <= N - 1 ; i++) {
            result = result * (K - 1);
        }
        System.out.println(result);
    }
}
