import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong(), n = sc.nextLong();

        if(n == 0) {
            System.out.println(1);
        } else if(n % 2 == 0) {
            System.out.println((long)Math.pow(Math.pow(m, 2), n / 2) % 1000000007);
        } else {
            System.out.println((long)Math.pow(Math.pow(m, 2), n / 2) * m % 1000000007);
        }
    }
}