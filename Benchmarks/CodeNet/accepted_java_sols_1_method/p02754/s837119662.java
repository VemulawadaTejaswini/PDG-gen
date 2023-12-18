import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = 0;
        long tmp = a * (n / (a + b));
        long tmp2 = Math.min(a, n % (a + b));
        System.out.println(tmp + tmp2);
    }
}