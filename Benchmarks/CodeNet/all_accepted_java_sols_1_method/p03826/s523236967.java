import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int AB = A * (scanner.nextInt());
        int C = scanner.nextInt();
        int CD = C * (scanner.nextInt());

        if (AB > CD) {
            System.out.println(AB);
        } else {
            System.out.println(CD);
        }
    }
}