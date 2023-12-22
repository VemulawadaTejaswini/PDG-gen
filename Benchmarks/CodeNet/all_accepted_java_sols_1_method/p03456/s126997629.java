import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String a = in.next();
            String b = in.next();
            int value = Integer.parseInt(a + b);
            for (int n = 1; n < value; n++) {
                if (n * n == value) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
    }
}
