import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        char x = a.charAt(0);
        int cnta = 1;
        int cntb = 0;
        int cntc = 0;
        while (true) {
            if (x == 'a') {
                try {
                    x = a.charAt(cnta);
                } catch (Exception e) {
                    System.out.println("A");
                    System.exit(0);
                }
                cnta++;
            } else if (x == 'b') {
                try {
                    x = b.charAt(cntb);
                } catch (Exception e) {
                    System.out.println("B");
                    System.exit(0);
                }
                cntb++;
            } else {
                try {
                    x = c.charAt(cntc);
                } catch (Exception e) {
                    System.out.println("C");
                    System.exit(0);
                }
                cntc++;
            }
        }
    }
}
