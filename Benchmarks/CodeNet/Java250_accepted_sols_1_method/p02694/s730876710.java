import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long yokin = 100;
        long n = 0;

        while (yokin < x) {
            yokin = (long) ((double) yokin * 1.01);
            n++;
        }

        System.out.print(n);
    }
}