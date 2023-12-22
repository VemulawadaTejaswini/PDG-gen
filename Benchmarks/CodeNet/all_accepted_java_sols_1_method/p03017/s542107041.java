import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int d = sc.nextInt() - 1;
        String[] s = sc.next().split("");
        for (int i = a; i < Math.max(c, d) - 1; i++) {
            if ("#".equals(s[i]) && "#".equals(s[i + 1])) {
                System.out.println("No");
                return;
            }
        }
        if (c < d) {
            System.out.println("Yes");
            return;
        }
        boolean canOvertake = false;
        for (int i = b - 1; i < d; i++) {
            if (".".equals(s[i]) && ".".equals(s[i + 1]) && ".".equals(s[i + 2])) {
                canOvertake = true;
            }
        }
        if (canOvertake) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
