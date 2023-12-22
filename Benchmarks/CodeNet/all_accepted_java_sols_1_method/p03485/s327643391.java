import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = (a + b) / 2;
        if ((a + b) % 2 != 0) {
            x++;
        }
        System.out.println(x);
    }
}