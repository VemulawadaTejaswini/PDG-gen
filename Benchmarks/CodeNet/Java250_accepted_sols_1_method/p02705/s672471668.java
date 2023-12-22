import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        double result = 2 * 3.14 * radius;

        System.out.println(result);
    }
}