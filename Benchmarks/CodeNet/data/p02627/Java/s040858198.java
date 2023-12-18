import java.util.*;
import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        if (Character.isUpperCase(sc.next().charAt(0))) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
