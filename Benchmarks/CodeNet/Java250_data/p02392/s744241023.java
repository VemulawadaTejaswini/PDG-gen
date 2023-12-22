import java.util.Scanner;
import static java.lang.System.out;

class Range {
    public void run() {
        Scanner scan = new Scanner( System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        out.println( ( a < b) ? ( ( b < c) ? "Yes" : "No") : "No");

    }
}

public class Main {
    public static void main( String... args) {
        Range test = new Range();
        test.run();
    }
}