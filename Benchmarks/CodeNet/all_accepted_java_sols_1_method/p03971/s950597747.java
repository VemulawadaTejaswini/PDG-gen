import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        int bCount = 0;
        for (int i = 0; i < n; i++) {
            if (count >= a + b) {
                System.out.println("No");
            } else if (s.charAt(i) == 'a') {
                System.out.println("Yes");
                count++;
            } else if (s.charAt(i) == 'b') {
                if (bCount < b) {
                    System.out.println("Yes");
                    count++;
                } else {
                    System.out.println("No");
                }
                bCount++;
            } else {
                System.out.println("No");
            }
        }
    }
}