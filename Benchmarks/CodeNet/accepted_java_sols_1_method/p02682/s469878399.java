import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int sum_A = Math.min(A, K);
        int sum_B = Math.min(K - sum_A, B);
        int sum_C = Math.min(K - sum_A - sum_B, C);
        System.out.println(sum_A - sum_C);
        sc.close();
    }
}