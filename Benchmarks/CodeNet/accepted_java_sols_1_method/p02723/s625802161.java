import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        // int n = Integer.parseInt(sc.next());
        // int[] a = new int[n];

        // for (int i = 0; i < n; i++) {
        // a[i] = Integer.parseInt(sc.next());
        //
        // }

        if (n.charAt(2) == n.charAt(3) && n.charAt(4) == n.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // System.out.println();

    }
}