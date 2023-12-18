import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int pt = 0;
        for (int i = 0; i < 2; i++) {
            if (a >= b) {
                pt = pt + a;
                a--;
            } else if (a < b) {
                pt = pt + b;
                b--;
            }
        }

        System.out.println(pt);
    }
}