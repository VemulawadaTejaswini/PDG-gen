
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();

        PrintStream printf;
        printf = System.out.printf("%.5f %.5f\n", (r * r * Math.PI), (r * 2 * Math.PI));
    }
}


