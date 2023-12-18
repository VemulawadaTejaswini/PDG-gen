
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a >= 1 && a <= 13 && b >= 1 && b <= 13 && c >= 1 && c <= 13) {
            if ((a + b + c) >= 22) {
                System.out.println("bust");
            } else {
                System.out.println("win");
            }
        }
    }
}
