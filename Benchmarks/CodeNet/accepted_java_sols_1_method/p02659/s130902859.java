import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");
        BigInteger A = new BigInteger(line[0]);
        String[] s = line[1].split("\\.");
        BigInteger B;
        if (s[0].equals("0")) {
            if (s[1].startsWith("0")) {
                B = new BigInteger(s[1].substring(1));
            } else {
                B = new BigInteger(s[1]);
            }
        } else {
            B = new BigInteger(s[0] + s[1]);
        }
        BigInteger lim = new BigInteger("100");
        BigInteger res = A.multiply(B);
        if (res.compareTo(lim) < 0) {
            System.out.println("0");
        } else {
            String r = res.toString();
            System.out.println(r.substring(0, r.length() - 2));
        }
    }
}
