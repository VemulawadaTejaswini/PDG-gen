import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = sc.next();
            }

            int ac = 0;
            int wa = 0;
            int tle = 0;
            int re = 0;
            for (int i = 0; i < N; i++) {
                if ("AC".equals(S[i])) {
                    ac++;
                } else if ("WA".equals(S[i])) {
                    wa++;
                } else if ("TLE".equals(S[i])) {
                    tle++;
                } else if ("RE".equals(S[i])) {
                    re++;
                }
            }

            System.out.println("AC x " + ac);
            System.out.println("WA x " + wa);
            System.out.println("TLE x " + tle);
            System.out.println("RE x " + re);
        }
    }
}
