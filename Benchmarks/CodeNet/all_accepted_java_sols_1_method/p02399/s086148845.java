import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        int d = a / b;
        int r = a % b;
        double f = (double) a / (double) b;

        System.out.println(d + " " + r + " " + String.format("%.5f", f));
    }
}