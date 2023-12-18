import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int k = Integer.parseInt(scanner.nextLine());
        boolean success = false;
        for (int i = 0; i < k; i++) {
            if (a < b) {
                c *= 2;
                if (b < c) {
                    success = true;
                }
            } else {
                b *= 2;
            }
        }
        if (success) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}