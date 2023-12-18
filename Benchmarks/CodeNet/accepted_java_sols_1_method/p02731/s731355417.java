import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();

        double length = (double) L / 3;

        System.out.println(String.format("%.12f", length * length * length));
    }
}