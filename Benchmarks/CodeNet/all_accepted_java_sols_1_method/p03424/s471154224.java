import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            if (s[i].equals("Y")) {
                System.out.println("Four");
                System.exit(0);
            }
        }
        System.out.println("Three");
    }
}