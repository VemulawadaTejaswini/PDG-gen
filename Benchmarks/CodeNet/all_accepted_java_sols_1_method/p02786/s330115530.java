import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long health = in.nextLong();
        long attacks, div = 0;

        while (health > 1) {
            div++;
            health /= 2;
        }

        attacks = 2 * (long) Math.pow(2, div) - 1;

        System.out.println(attacks);

        in.close();

    }
}
