import java.util.*;
import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
        String[] ar = new String[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.next();
            switch (ar[i]) {
                case "AC":
                    ac++;
                    break;
                case "WA":
                    wa++;
                    break;
                case "TLE":
                    tle++;
                    break;
                case "RE":
                    re++;
                    break;
            }

        }
        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
        System.out.println("TLE x " + tle);
        System.out.println("RE x " + re);

    }
}