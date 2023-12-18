
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    //Main
    public static void main(String args[]) throws Exception {

        Scanner Input = new Scanner(System.in);
        long W = Input.nextLong();
        long a = Input.nextLong();
        long b = Input.nextLong();

        if (a == b) {
            System.out.println("0");
        } else if (a > b) {
            if (a <= b + W) {
                System.out.println("0");
            } else {
                System.out.println(a - (b + W));
            }
        } else if (b > a) {
            if (b <= a + W) {
                System.out.println("0");
            } else {
                System.out.println(b - (a + W));
            }

        }

    }
}
