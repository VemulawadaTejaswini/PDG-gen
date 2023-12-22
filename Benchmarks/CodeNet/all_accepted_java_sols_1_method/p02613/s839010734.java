import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = "";
        int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;

        for (int i = 0; i < N; i++) {
            S = sc.next();
            if (S.equals("AC")) {
                ac++;
            } else if (S.equals("WA")) {
                wa++;
            } else if (S.equals("TLE")) {
                tle++;
            } else {
                re++;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println("AC x " + ac);
        out.flush();

        out.println("WA x " + wa);
        out.flush();

        out.println("TLE x " + tle);
        out.flush();

        out.println("RE x " + re);
        out.flush();

        sc.close();

    }
}