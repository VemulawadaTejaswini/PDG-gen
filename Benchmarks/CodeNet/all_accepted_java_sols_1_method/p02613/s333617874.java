import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String AC = "AC";
        final String WA = "WA";
        final String TLE = "TLE";
        final String RE = "RE";
        final String x = " x ";

        int ACc = 0;
        int WAc = 0;
        int TLEc = 0;
        int REc = 0;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            if (S.equals(AC)) {
                ACc++;
            } else if (S.equals(WA)) {
                WAc++;
            } else if (S.equals(TLE)) {
                TLEc++;
            } else {
                REc++;
            }
        }
        System.out.println(AC + x + ACc);
        System.out.println(WA + x + WAc);
        System.out.println(TLE + x + TLEc);
        System.out.println(RE + x + REc);
    }
}