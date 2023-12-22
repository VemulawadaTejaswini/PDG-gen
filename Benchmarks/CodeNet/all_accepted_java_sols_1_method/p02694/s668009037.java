import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long yokin = 100;
        long n = 0;

        while (true) {
            if (x <= yokin) {
                break;
            }
            yokin = (long) ((double) yokin * 1.01);
            n++;
        }

        System.out.print(n);
    }
}