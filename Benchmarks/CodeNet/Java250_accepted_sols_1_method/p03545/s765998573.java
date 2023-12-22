import java.util.*;

public class Main {
    static String[] s;
    static int[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = new int[4];
        s = new String[4];
        s = sc.next().split("");

        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        //bit全探索 2**3
        for (int i = 0; i < (1 << 3); i++) {

            int tmp = a[0];
            for (int j = 0; j < 3; j++) {
                if ((1 & i >> j) == 1) {
                    tmp += a[j + 1];
                } else {
                    tmp -= a[j + 1];
                }
            }
            if (tmp == 7) {
                System.out.print(s[0]);
                for (int j = 0; j < 3; j++) {
                    if ((1 & i >> j) == 1) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                    System.out.print(a[j + 1]);
                }
                System.out.println("=7");
                return;
            }
        }
    }
}

