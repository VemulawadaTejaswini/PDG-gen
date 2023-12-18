import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (9 < a) {
            System.out.println(-1);
            return;
        }
        int b = scanner.nextInt();
        if (9 < b) {
            System.out.println(-1);
            return;
        }
        System.out.println(a*b);
    }
}