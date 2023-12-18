import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double tax_rate = 1.08;
        int N = sc.nextInt();
        double X;
        X = (double) N / tax_rate;
        if (N == (int)Math.floor(Math.floor(X) * tax_rate)) {
            System.out.println((int)Math.floor(X));
        } else if (N == (int) Math.floor(Math.ceil(X) * tax_rate)) {
            System.out.println((int)Math.ceil(X));
        } else {
            System.out.println(":(");
        }
    }
}