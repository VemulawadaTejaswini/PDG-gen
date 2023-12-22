import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        for (int i = 1; i <= N; i++) {

            if (N <= D) {
                System.out.println(1);
                break;
            }

            if (i - D > 0) {
                if (N % (i + D) != 0) {
                    System.out.println((N / (i + D)) + 1);
                    break;
                } else {
                    System.out.println(N / (i + D));
                    break;
                }
            }
        }
    }
}