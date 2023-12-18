import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int N = std.nextInt();
        int K = std.nextInt();

        double rate = 0;
        for (int i = 0; i < N; i++) {
            int point = i + 1;
            if (point >= K) {
                rate += 1 / (double) N;
                continue;
            }

            double v = K /(double) point;
            double count = Math.log10(v) / Math.log10(2);
            int c = (int)Math.ceil(count);
            double result = 1 / (double) N * Math.pow(0.5, c);
            rate += result;
        }

        System.out.println(rate);
    }
}
