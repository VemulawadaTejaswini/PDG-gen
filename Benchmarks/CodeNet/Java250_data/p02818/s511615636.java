import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        sc.close();

        long aftA = a - k;
        long aftB = b;
        if (aftA < 0) {
            aftB = aftB + aftA;
            aftA = 0;
        }

        if (aftB < 0) {
            aftB = 0;
        }

        System.out.println(aftA + " " + aftB);
    }

}