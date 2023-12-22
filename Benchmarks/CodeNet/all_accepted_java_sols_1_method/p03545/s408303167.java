import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] abcd = sc.next().toCharArray();
        for (int i = 0; i < 1 << abcd.length - 1; i++) {
            int ii = abcd[0] - 48;
            char[] op = new char[3];
            for (int j = 0; j < abcd.length - 1; j++) {
                int n = abcd[j + 1] - 48;
                if ((1 & i >> j) == 1) {
                    ii += n;
                    op[j] = '+';
                } else {
                    ii -= n;
                    op[j] = '-';
                }
            }
            if (ii == 7) {
                System.out.printf("%c%c%c%c%c%c%c=7\n", abcd[0], op[0], abcd[1], op[1], abcd[2], op[2], abcd[3]);
                return;
            }
        }
    }
}
