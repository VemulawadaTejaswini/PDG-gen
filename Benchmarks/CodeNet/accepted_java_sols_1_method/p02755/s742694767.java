import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = 1;
        while (x <= 1009) {
            if ((x * 8 / 100 == a) && (x * 10 / 100 == b)) {
                System.out.println(x);
                return;
            }
            x++;
        }
        System.out.println("-1");
    }
}