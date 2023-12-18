
import static java.lang.Math.pow;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean b = false;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == a) {
                    b = true;
                }
            }
        }
        if (b == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
