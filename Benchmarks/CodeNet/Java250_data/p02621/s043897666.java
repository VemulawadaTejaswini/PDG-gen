
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextInt();

        System.out.println((long) (a + Math.pow(a, 2) + Math.pow(a, 3)));
    }
}
