import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final int p = 1;
        switch (p) {
            case 1:
            P1.p1();
        }
    }
}

class P1 {

    static void p1() {
        final Scanner sc = new Scanner(System.in);
        final String yohou = sc.nextLine();
        final String jissai = sc.nextLine();

        final int res = calc(yohou, jissai);
        System.out.println(res);
    }

    static int calc(final String yohou, final String kekka) {
        int res = 0;
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(yohou.charAt(i), kekka.charAt(i))) {
                res++;
            }
        }
        return res;
    }
}