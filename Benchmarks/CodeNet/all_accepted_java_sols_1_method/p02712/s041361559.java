import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long all = (1 + n) * n / 2;
        long n3 = n / 3;
        long all3 = (3 + 3 * n3) * n3 / 2;
        long n5 = n / 5;
        long all5 = (5 + 5 * n5) * n5 / 2;
        long n15 = n / 15;
        long all15 = (15 + 15 * n15) * n15 / 2;
        long sum = all - all3 - all5 + all15;
        System.out.println(sum);
    }
}