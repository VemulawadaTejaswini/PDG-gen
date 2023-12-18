import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        String s = Long.toString(n, 26);
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int idx = 0;
        if (n <= 26) {
            s = Long.toString(n - 1, 26);
            int num = Integer.parseInt(s, 26);
            sb.append((char) ('a' + num));
        } else {
            while (s.length() >= 1) {
                if (s.substring(s.length() - 1).equals("0")) {
                    long dec = Long.parseLong(s, 26) - 1;
                    String ss = Long.toString(dec, 26);
                    int num = Integer.parseInt(ss.substring(ss.length() - 1), 26);
                    sb.append((char) ('a' + num));
                    s = ss;
                    idx++;
                } else {
                    int num = Integer.parseInt(s.substring(s.length() - 1), 26) - 1;
                    sb.append((char) ('a' + num));
                }
                s = s.substring(0, s.length() - 1);
            }
        }
        System.out.println(sb.reverse().toString());
    }
}