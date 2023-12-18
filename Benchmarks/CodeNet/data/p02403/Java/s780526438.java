import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 1;
        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
while (a != 0 && b != 0) {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b - 1; j++) {
                    System.out.print("#");
                }
                System.out.println("#");
            }
            System.out.println("");
        }
    }}
}