import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        if(x - (k * d) >= 0) {
            System.out.println(x - (k * d));
            return;
        }
        long tmp1 = x % d;
        long tmp2 = x / d;
        if(tmp2 % 2 == k % 2) {
            System.out.println(tmp1);
        } else {
            System.out.println(Math.abs(tmp1 - d));
        }
    }
}