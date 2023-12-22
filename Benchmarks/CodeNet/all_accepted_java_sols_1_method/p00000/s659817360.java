import java.util.*;

class Main {
    public static void main (String [] args) {

        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.printf("%dx%d=%d\n", x, y, x*y);
            }
        }

    }
}