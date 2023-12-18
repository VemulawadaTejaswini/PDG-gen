import java.util.Scanner;
import static java.lang.System.out;

class SmallLargeOrEqual {
    private String sign;

    SmallLargeOrEqual(int a, int b) {
        this.sign = (a == b) ? "==" : ((a > b) ? ">" : "<");
    }

    @Override
    public String toString() {
        return this.sign;
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