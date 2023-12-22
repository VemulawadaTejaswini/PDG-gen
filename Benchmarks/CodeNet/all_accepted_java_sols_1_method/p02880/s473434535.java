import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        boolean is9x9 = false;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int multi = i * j;
                if (n == multi) {
                    is9x9 = true;
                    break;
                }
            }
        }

        if (is9x9) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
