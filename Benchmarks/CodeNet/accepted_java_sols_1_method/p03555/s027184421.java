import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String line1 = in.next();
            String line2 = in.next();

            for (int i = 0; i < 3; i++) {
                if (line1.charAt(i) != line2.charAt(2 - i)) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
}
