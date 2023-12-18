import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        boolean ok = false;
        for (int i = 0; i < S.length(); i++) {
            String p1 = S.substring(0, i);
            String p2 = S.substring(i);
            if (T.equals(p2 + p1)) {
                ok = true;
                break;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}