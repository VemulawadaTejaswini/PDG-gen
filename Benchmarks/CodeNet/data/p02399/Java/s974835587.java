import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = a / b;
        int r = a % b;
        double f = (double)a / (double)b;
        System.out.print(d + " " + r + " ");
        System.out.printf("%f\n", f);
    }
}
