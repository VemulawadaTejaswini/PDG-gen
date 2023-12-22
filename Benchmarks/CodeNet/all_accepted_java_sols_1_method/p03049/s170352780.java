
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] str = new String[n];
        int count = 0;
        int A = 0;
        int B = 0;
        int BA = 0;
        for (int i = 0; i < n; ++i) {
            str[i] = scanner.next();
        }
        for (int i = 0; i < n; ++i) {
            String current = str[i];
            for (int j = 0; j < current.length() - 2; ++j) {
                if (current.charAt(j) == 'A' && current.charAt(j + 1) == 'B') {
                    ++count;
                }
            }
            if (current.charAt(0) == 'B' && current.charAt(current.length() - 1) == 'A') {
                ++BA;
            } else if (current.charAt(0) == 'B') {
                ++B;
            } else if (current.charAt(current.length() - 1) == 'A') {
                ++A;
            }
        }
        if (BA >= 2) {
            count += BA - 1;
            if (A > 0) {
                ++count;
            }
            if (B > 0) {
                ++count;
            }
        } else {
            if (BA > 0) {
                if (A > 0) {
                    ++count;
                }
                if (B > 0) {
                    ++count;
                }
            } else {
                if (A > 0 && B > 0) {
                    ++count;
                }
            }
        }
        if (A - 1 > 0 && B - 1 > 0) {
            count += Math.min(A, B) - 1;
        }

        System.out.println(count);

    }
}
