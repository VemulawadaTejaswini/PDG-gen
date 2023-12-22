import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int result = 1;

            int tmp = N;
            while (tmp / K > 0) {
                result++;
                tmp /= K;
            }

            System.out.println(result);

        }
    }

}