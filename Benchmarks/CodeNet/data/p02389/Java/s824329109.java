import java.util.Scanner;
import static java.lang.System.out;

class Rectangle {
    public void run() {
        Scanner scan = new Scanner( System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        out.printf( "%d %d\n", a * b, a * 2 + b * 2  );
    }
}

public class Main {
    public static void main( String... args) {
        Rectangle test = new Rectangle();
        test.run();
    }
}