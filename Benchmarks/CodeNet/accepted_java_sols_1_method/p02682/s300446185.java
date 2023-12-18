import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < A && i < K; i++) {
            sum++;
        }
        for (int i = (A + B); i < K; i++) {
            sum--;
        }
        System.out.println(sum);
        sc.close();
    }
}