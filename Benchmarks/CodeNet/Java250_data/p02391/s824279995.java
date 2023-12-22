import java.util.Scanner;
import static java.lang.System.out;

class SmallLargeOrEqual {
    private int a;
    private int b;

    SmallLargeOrEqual(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return String.format((this.a == this.b) ? "==" : ((this.a > this.b) ? ">" : "<"));
    }
}

public class Main {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        out.println("a " + new SmallLargeOrEqual(a, b) + " b");
    }
}