import java.util.*;
import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        for (int i = 1; i <= 5; i++) {
            if (sc.nextInt() == 0) {
                System.out.println(i);
            }
        }
    }
}
