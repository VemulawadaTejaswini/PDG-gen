import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 0;

        int i = 0;
        for (i = 0; i <= N; i++) {
            sum += i;
            if (sum >= N) {
                break;
            }
        }
        for (int j = 1; j <= i; j++) {
            if (j == (sum - N)) {
                continue;
            }
            System.out.println(j);
        }
    }
}
