import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        int blowsA = (a + d - 1) / d;
        int blowsT = (c + b - 1) / b;

        System.out.println(blowsT <= blowsA ? "Yes" : "No");
    }
}
