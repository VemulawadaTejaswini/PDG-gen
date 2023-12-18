import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int n = s.length();

        for (int st = 0; st < n; st++) {
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != t.charAt((i+st)%n)) {
                    ok = false;
                }
            }

            if (ok) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
