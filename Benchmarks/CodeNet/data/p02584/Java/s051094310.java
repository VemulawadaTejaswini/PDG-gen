import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        minimumAbs();
    }

    private static void minimumAbs() {

        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();

        if (X == D) {
            System.out.println(X);
            return;
        }

        long current = X;
        for (int i = 0; i < K; i++) {
            current = Math.min(Math.abs(current + D), Math.abs(current - D));

        }
        System.out.println(current);

    }
}