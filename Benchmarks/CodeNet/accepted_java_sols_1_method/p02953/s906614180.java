import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int old = sc.nextInt();
        boolean used = false;
        for (int i = 1; i < n; i++) {
            int h  =sc.nextInt();
            if (old > h + 1) {
                System.out.println("No");
                return;
            }
            if (old == h + 1) {
                if (used) {
                    System.out.println("No");
                    return;
                }
                used = true;
            }
            if (old < h) {
                used = false;
            }
            old = h;
        }
        System.out.println("Yes");
    }
}