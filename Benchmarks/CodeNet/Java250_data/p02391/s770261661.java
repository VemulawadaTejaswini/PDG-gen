import java.util.Scanner;
import static java.lang.System.out;

class SmallLargeOrEqual {
    public void run() {
        Scanner scan = new Scanner( System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        out.printf( "a %s b\n", ( a == b) ? "==" : ( (a > b) ? ">" : "<" ));

    }
}

public class Main {
    public static void main( String... args) {
        SmallLargeOrEqual test = new SmallLargeOrEqual();
        test.run();
    }
}