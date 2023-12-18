import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int tmp = Integer.parseInt(string);
        int a = tmp / 100;
        int b = tmp % 100;

        if ((a > 12 || a < 1) && (b <= 12 && b >= 1)) {
            System.out.println("YYMM");
        } else if ((b > 12 || b < 1) && (a <= 12 && a >= 1)) {
            System.out.println("MMYY");
        } else if ((a <= 12 || a >= 1) && (b <= 12 && b >= 1)) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("NA");
        }
    }
}