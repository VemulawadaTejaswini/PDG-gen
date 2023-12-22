import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();

        Integer x = a / b;
        Integer y = a % b;
        double z = (double) a / (double) b;
        System.out.println(x + " " + y + " " + String.format("%.5f", z));
    }
}
