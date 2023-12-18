import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean all2 = true;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                all2 = false;
                break;
            }
        }

        if (all2) {
            System.out.println("second");
        } else {
            System.out.println("first");
        }
    }
}
