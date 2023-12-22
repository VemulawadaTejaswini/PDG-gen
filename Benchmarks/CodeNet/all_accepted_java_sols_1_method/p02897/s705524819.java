import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double d;
        if (N%2 == 0) {
            d = (double)(N/2)/N;
        } else {
            d = (double) ((N + 1) / 2) / N;
        }

        sc.close();

        System.out.println(String.format("%.10f", d));
    }
}