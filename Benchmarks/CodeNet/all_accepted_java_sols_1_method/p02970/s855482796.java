import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextInt();
        double D = sc.nextInt();

        double watch = 1 + D*2;

        double answer = Math.ceil(N/watch);

        // System.out.println(N);
        // System.out.println(watch);
        System.out.println((int)answer);


    }
}