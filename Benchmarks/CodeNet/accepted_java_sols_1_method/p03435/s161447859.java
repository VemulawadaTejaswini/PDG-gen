import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        boolean ok = false;
        for (int x = -100; x <= 100; x++) {
            if (a + x == d && b + x == e && c + x == f) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("No");
            return;
        }
        ok = false;
        for (int x = -100; x <= 100; x++) {
            if (g + x == d && h + x == e && i + x == f) {
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
