import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Math.pow(scan.nextInt(), 2);
        System.out.println((int) x);
        scan.close();
    }
}