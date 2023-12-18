import java.util.Scanner;

public class Main {
    private static double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();

        System.out.println(2 * R * PI);
    }
}