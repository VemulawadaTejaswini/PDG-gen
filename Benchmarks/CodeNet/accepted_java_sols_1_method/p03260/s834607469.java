
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            if (Integer.parseInt(sc.next()) == 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");

    }
}
