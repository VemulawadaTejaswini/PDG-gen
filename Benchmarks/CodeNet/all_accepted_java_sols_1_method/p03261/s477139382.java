import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
        }
        for (int i = 0; i < n - 1; i++) {
            if (w[i].charAt(w[i].length() - 1) != w[i + 1].charAt(0)) {
                System.out.println("No");
                System.exit(0);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (w[i].equals(w[j])) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}