import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            int N = Integer.parseInt(sc.next());
            int ac = 0, wa = 0, tle = 0, re = 0;
            String in;
            for (int i = 0; i < N; i++) {
                in = sc.next();
                switch (in) {
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
}