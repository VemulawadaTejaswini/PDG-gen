import java.util.Scanner;

public class Main {
    final long X = (long) Math.pow(10, 18);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        if (k%2 == 0) {
            System.out.println(a-b);
        }
        else {
            System.out.println(b-a);
        }
        sc.close();
    }
}