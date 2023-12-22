import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int A = S.charAt(0) - '0';
            int B = S.charAt(1) - '0';
            int C = S.charAt(2) - '0';
            int D = S.charAt(3) - '0';

            for (int op1 = -1; op1 <= 1; op1 += 2) {
                for (int op2 = -1; op2 <= 1; op2 += 2) {
                    for (int op3 = -1; op3 <= 1; op3 += 2) {
                        if (A + op1 * B + op2 * C + op3 * D == 7) {
                            System.out.println("" + A + (op1 == 1 ? "+" : "-") + B + (op2 == 1 ? "+" : "-") + C + (op3 == 1 ? "+" : "-") + D + "=7");
                            return;
                        }
                    }
                }
            }

        }
    }
}
