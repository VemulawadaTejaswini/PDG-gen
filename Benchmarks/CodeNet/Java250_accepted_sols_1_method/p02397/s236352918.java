import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int b = 1;

        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a > b) {
                int c;
                c = a;
                a = b;
                b = c;
            }
            if (a == 0 && b ==0) {
                break;
            }
            System.out.println(a + " " + b);
        }
    }
}