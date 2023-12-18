
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (m >= 2 * n) {
            long c = n + (m - 2 * n) / 4;
            System.out.println(c);
        } else {
            System.out.println(m/2);
        }


    }

}