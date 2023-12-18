import java.util.*;

import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("AC")) {
                ac++;
            } else if (s.equals("WA")) {
                wa++;
            } else if (s.equals("TLE")) {
                tle++;
            } else if (s.equals("RE")) {
                re++;
            }
        }
        System.out.println("AC x "  + ac);
        System.out.println("WA x "  + wa);
        System.out.println("TLE x "  + tle);
        System.out.println("RE x "  + re);
    }
}
