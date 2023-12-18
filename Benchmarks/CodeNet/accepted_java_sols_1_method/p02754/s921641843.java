import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a == 0) {
            System.out.println(0);
        } else {
            long count = n / (a + b);
            long plus = n - count * (a + b);
            if (plus > a) {
                plus = a;
            }
            System.out.println(count * a + plus);
        }
    }
}
