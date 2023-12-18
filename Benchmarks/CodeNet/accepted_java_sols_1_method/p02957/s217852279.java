import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long k = (a + b) / 2;
        if (k * 2 == a + b) System.out.println(k);
        else System.out.println("IMPOSSIBLE");
    }
}
