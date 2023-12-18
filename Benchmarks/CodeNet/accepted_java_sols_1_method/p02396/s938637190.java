import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (true) {
            a++;
            int b = scanner.nextInt();
            if (b == 0) {
                break;
            }
            System.out.println("Case " + a + ": " + b);

        }
    }
}