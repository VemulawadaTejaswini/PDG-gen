import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();

        double A_div = A / K;
        double B_div = B / K;

        if (B_div - A_div >= 1 || A % K == 0 || B % K == 0) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        s.close();
    }
}