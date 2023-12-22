import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = Integer.parseInt(in.next());
            int B = Integer.parseInt(in.next());
            String S = in.next();

            for (int i = 0; i < A; i++) {
                char c = S.charAt(i);
                if (c >= '0' && c <= '9') {
                } else {
                    System.out.println("No");
                    return;
                }
            }
            for (int i = A; i < A + 1; i++) {
                char c = S.charAt(i);
                if (c != '-') {
                    System.out.println("No");
                    return;
                }
            }
            for (int i = A + 1; i < A + 1 + B; i++) {
                char c = S.charAt(i);
                if (c >= '0' && c <= '9') {
                } else {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
