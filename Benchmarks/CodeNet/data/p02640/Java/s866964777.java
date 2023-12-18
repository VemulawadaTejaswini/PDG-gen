import java.util.*;

import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i * 2 + (x - i) * 4 == y) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
