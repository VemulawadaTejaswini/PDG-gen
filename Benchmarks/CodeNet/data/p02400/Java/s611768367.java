import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.next());

        double area = r * r * Math.PI;
        double perimeter = 2.0 * r * Math.PI;

        System.out.println(area + " " + perimeter);
    }
}