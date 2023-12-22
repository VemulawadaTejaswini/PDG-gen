import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        out.printf("%d %d%n", a * b, (a * 2 + b * 2));                            

    }
}