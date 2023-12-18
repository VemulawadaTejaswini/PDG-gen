import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int cpw = b + 7 * a;
            int ws = c / cpw;
            int rc = c - cpw * ws;
            int ds = rc / a;
            int rm = rc - a * ds;
            if (rm > 0) {
                ds++;
            }
            int days = ws * 7 + ds;
            if (b > 0 && ds > 7) {
                int wd = (ws + 1) * 7;
                if (days > wd) {
                    days = wd;
                }
            }
            System.out.println(String.format("%d", days));
        }
    }
}

