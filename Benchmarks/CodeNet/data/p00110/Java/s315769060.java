import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while (true) {
                input = r.readLine();
                if (input == null) break;
                String[] ns = input.split("[+=]");
                System.out.println(solve(ns));
            }
        } catch (Exception e) {}
    }

    public static String solve(String[] ns) {
        for (int X = 0; X <= 9; X++) {
            BigInteger[] ns_i = new BigInteger[126];
            for (int i = 0; i < ns.length; i++) {
                if (ns[i].charAt(0) == 'X' && X == 0) {
                    ns_i[i] = new BigInteger("999999999999999999");
                    continue;
                }
                ns_i[i] = new BigInteger(ns[i].replace("X", String.valueOf(X)));
            }
            if (ns_i[0].add(ns_i[1]).equals(ns_i[2])) {
                return String.valueOf(X);
            }
        }
        return "NA";
    }
}