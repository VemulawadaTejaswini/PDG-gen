import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
//        Integer b = scanner.nextInt();

        double x = a * 2 * 3.14159265359;
        double y = a * a * 3.14159265359;
        System.out.println(y + " " + x);
    }
}

