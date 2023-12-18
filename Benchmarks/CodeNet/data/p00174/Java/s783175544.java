
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String utu = scanner.next();
        while (!utu.equals("0")) {
            int A = 0;
            int B = 0;
            int len = utu.length();

            for (int i = 1; i < len; i++) {
                char ch = utu.charAt(i);
                if (ch == 'A') {
                    B++;
                } else {
                    A++;
                }
            }
            if (A < B) {
                B++;
            } else {
                A++;
            }

            System.out.println(B + " " + A);
            utu = scanner.next();

        }
    }
}

