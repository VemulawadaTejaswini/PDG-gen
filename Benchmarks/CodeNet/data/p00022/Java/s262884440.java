
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

final class Main {

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int n = Integer.parseInt(inputReader.readLine());
            if (n == 0) {
                break;
            }
            BigInteger sum = BigInteger.ZERO;
            while(n-- > 0) {
                sum = sum.add(new BigInteger(inputReader.readLine()));
            }
            System.out.println(sum.toString());
        }
    }
}