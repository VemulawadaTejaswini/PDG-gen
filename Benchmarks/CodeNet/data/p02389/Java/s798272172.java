import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        int area = a * b;
        int permimeter = 2 * a + 2 * b;

        System.out.println(area + " " + permimeter);
    }
}